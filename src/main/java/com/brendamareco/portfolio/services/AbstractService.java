package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.interfaces.IEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public abstract class AbstractService<T extends IEntity<ID>,ID>
{
    private JpaRepository<T,ID> repository;

    public AbstractService(JpaRepository<T,ID> repository) {this.repository = repository;}

    public List<T> getAll()
    {
        return this.repository.findAll();
    }

    public T add(T entity)
    {
        entity.setId(null);
        return this.repository.save(entity);
    }

    public T update(T entity)
    {
        if (entity.getId() == null)
            throw new IllegalArgumentException("Entity id must not be null");

        T existingEntity = repository
                .findById(entity.getId())
                .orElseThrow(() -> new EntityNotFoundException("Entity not found with id: " + entity.getId()));

        BeanUtils.copyProperties(entity, existingEntity, getNullPropertyNames(entity));

        return repository.save(existingEntity);
    }

    public void deleteById(ID id)

    {
        if (!this.repository.existsById(id))
            throw new EntityNotFoundException();

        this.repository.deleteById(id);
    }

    protected String[] getNullPropertyNames(T source)
    {
        final BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for(PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
