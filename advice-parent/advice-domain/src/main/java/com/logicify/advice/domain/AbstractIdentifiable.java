package com.logicify.advice.domain;

import javax.persistence.*;

/**
 * User: knorr
 * Date: 10/26/12
 * Time: 2:39 PM
 */
@MappedSuperclass
public abstract class AbstractIdentifiable implements Identifiable {
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "_id", unique = true, nullable = false, precision = 20, scale = 0, columnDefinition = "numeric")
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractIdentifiable)) return false;
        AbstractIdentifiable that = (AbstractIdentifiable) o;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
