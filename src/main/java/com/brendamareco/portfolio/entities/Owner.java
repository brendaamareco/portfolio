package com.brendamareco.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`owner`")
@Getter
@Setter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(name = "last_name")
    String lastName;
    String country;
    String province;

    public Owner() {}

    public Owner(Long id, String name, String lastName, String country, String province) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.province = province;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
