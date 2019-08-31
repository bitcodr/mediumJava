package com.medium.instance.models.DTO.user;

import com.medium.instance.models.DTO.media.MediaDTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.Objects;


public class WebUserDTO extends BaseUserDTO {

    @NotNull
    @Size(min = 5, max = 30)
    @Column(nullable = false, length = 70, unique = true)
    private String firstName, lastName;

    @Null
    private MediaDTO avatar;

    @Null
    @Column(length = 400,nullable = false)
    private String emailVerificationToken;

    @NotNull
    @Column(nullable = false)
    private boolean emailISVerified = false;

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public boolean isEmailISVerified() {
        return emailISVerified;
    }

    public void setEmailISVerified(boolean emailISVerified) {
        this.emailISVerified = emailISVerified;
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

    public MediaDTO getAvatar() {
        return avatar;
    }

    public void setAvatar(MediaDTO avatar) {
        this.avatar = avatar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WebUserDTO)) return false;
        WebUserDTO that = (WebUserDTO) o;
        return isEmailISVerified() == that.isEmailISVerified() &&
                getFirstName().equals(that.getFirstName()) &&
                getLastName().equals(that.getLastName()) &&
                getAvatar().equals(that.getAvatar()) &&
                getEmailVerificationToken().equals(that.getEmailVerificationToken());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAvatar(), getEmailVerificationToken(), isEmailISVerified());
    }
}
