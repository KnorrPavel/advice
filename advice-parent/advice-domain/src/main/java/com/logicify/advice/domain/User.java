package com.logicify.advice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User: knorr
 * Date: 10/26/12
 * Time: 2:50 PM
 */
@Entity
@Table(name = "users", schema = "public", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name", "email"})
})
public class User extends AbstractIdentifiable {

    private String name;
    private String email;
    private String passwordHash;

    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password_hash", nullable = false, length = 255)
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

}