package com.medium.instance.models.entity.user;

import com.medium.instance.models.DTO.media.MediaDTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "users")
public class WebUserEntity extends BaseUserEntity {


    @NotNull
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "webUser")
    private MediaDTO avatar;

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

    public MediaDTO getAvatar() {
        return avatar;
    }

    public void setAvatar(MediaDTO avatar) {
        this.avatar = avatar;
    }
}