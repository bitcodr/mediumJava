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
    @Column(length = 30,name = "first_name")
    private String firstName;

    @NotNull
    @Length(min = 5, max = 30)
    @Column(length = 30,name = "last_name")
    private String lastName;

    @NotNull
    @Email
    @Column(nullable = false, unique = true, updatable = false, length = 70)
    private String email;


    @NotNull
    @Length(min = 8, max = 32)
    @Column(nullable = false, unique = true, updatable = false, length = 32,name = "user_name")
    private String userName;


    @NotNull
    @Length(max = 255)
    @Column(nullable = false, unique = true, updatable = false)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}


