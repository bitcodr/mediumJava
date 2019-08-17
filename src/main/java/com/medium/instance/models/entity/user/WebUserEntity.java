package com.medium.instance.models.entity.user;

import com.medium.instance.models.entity.media.MediaEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("webUserEntity")
public class WebUserEntity extends BaseUserEntity {


    @Null
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "webUser")
    private MediaEntity avatar;

    @NotNull
    @Column(length = 255, nullable = false,name = "email_verification_token")
    private String emailVerificationToken;

    @NotNull
    @Column(nullable = false,name = "email_is_verified")
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

    public MediaEntity getAvatar() {
        return avatar;
    }

    public void setAvatar(MediaEntity avatar) {
        this.avatar = avatar;
    }
}