package com.medium.instance.models.entity.user;

import com.medium.instance.models.DTO.media.Media;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "users")
public class WebUser extends BaseUser {


    @NotNull
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "webUser")
    private Media avatar;

    @NotNull
    @Column(length = 400, nullable = false)
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

    public Media getAvatar() {
        return avatar;
    }

    public void setAvatar(Media avatar) {
        this.avatar = avatar;
    }
}