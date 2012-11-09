package com.logicify.advice.domain;

import java.math.BigInteger;

/**
 * User: knorr
 * Date: 11/1/12
 * Time: 6:44 PM
 */
public class Community {

    private BigInteger id;
    private String name;
    private String description;


    public Community(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Community [" +
                "name='" + name + '\'' +
                ']';
    }
}
