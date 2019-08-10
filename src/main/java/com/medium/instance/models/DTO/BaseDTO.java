package com.medium.instance.models.DTO;


import com.medium.instance.models.Status;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class BaseDTO implements Serializable {

    public static final long serialVersionUID = 3156397202191748965L;

    @Id
    @NotNull
    private UUID id;


    @NotNull
    private Date createdAt;

    @NotNull
    private Status status;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
