package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public abstract class AbstractService<T extends IEntity<ID>,ID, S extends JpaRepository<T,ID>>
{
    @Autowired S repository;

    public List<T> getAll()
    {
        return this.repository.findAll();
    }
    public T add(T entity)
    {
        entity.setId(null);
        return this.repository.save(entity);
    }

    public T update(ID id, T entity)
    {
        T existingEntity = repository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity not found with id: " + id));

        BeanUtils.copyProperties(entity, existingEntity, getNullPropertyNames(entity));

        return repository.save(existingEntity);
    }

    public void deleteById(ID id)
    {
        this.repository.deleteById(id);
    }

    protected String[] getNullPropertyNames(T source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
