package com.medium.instance.models.response.user;


import com.medium.instance.models.response.BaseResponse;

import javax.validation.constraints.Null;

public class WebUserResponse extends BaseResponse {

    @Null
    private String firstName;

    @Null
    private String lastName;

    @Null
    private String email;

    @Null
    private String userName;

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
}
