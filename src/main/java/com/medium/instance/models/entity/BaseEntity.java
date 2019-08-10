package com.medium.instance.models.entity;

import com.medium.instance.models.Status;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class BaseEntity implements Serializable {

    public static final long serialVersionUID = 1470104970029217041L;

    @Id
    @NotNull
    @Column(nullable = false, unique = true,updatable = false)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid" ,strategy = "org.hibernate.id.UUIDGenerator")
    protected UUID id;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    protected Date createdAt;


    @NotNull
    @Column(name = "created_by", nullable = false, updatable = false)
    @CreatedBy
    protected UUID createdBy;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = true)
    @LastModifiedDate
    protected Date updatedAt;


    @Column(name = "updated_by", nullable = true)
    @LastModifiedBy
    protected UUID updateBy;

    @NotNull
    @Column(length = 20, nullable = false, updatable = true)
    @Enumerated(value = EnumType.STRING)
    protected Status status = Status.ACTIVATE;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UUID getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(UUID updateBy) {
        this.updateBy = updateBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



}
