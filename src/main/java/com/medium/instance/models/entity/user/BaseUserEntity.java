package com.medium.instance.models.entity.user;

import com.medium.instance.models.entity.BaseEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class BaseUserEntity extends BaseEntity {

    @NotNull
    @Length(min = 5, max = 30)
    @Column(nullable = true, updatable = true,length = 30)
    private String name, lastName;

    @NotNull
    @Email
    @Column(nullable = false, unique = true, updatable = false,length = 70)
    private String email;


    @NotNull
    @Length(min = 8, max = 32)
    @Column(nullable = false, unique = true, updatable = false, length = 32)
    private String username;


    @NotNull
    @Length(max = 255)
    @Column(nullable = false, unique = true, updatable = false,length = 255)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}


