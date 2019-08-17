package com.medium.instance.models.DTO.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medium.instance.models.DTO.BaseDTO;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BaseUserDTO extends BaseDTO {

    @NotNull
    @Email
    @Column(length = 100, nullable = false)
    private String email;

    @NotNull
    @Size(min = 8, max = 150)
    @Column(length = 150, nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull
    @Length(min = 5, max = 30)
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
