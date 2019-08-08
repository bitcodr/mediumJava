package com.medium.instance.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

public class BaseModel {

    public BaseModel(){

    }

    public BaseModel(UUID id, Date created_at, UUID created_by, Date updated_at, UUID updated_by, Status status) {
        this.id = id;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
        this.status = status;
    }

    @Id
    @NotNull
    @Column(nullable = false, unique = true)
    private UUID id;

    @NotNull
    @Column(nullable = false, length = 36)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UUID created_by;

    @NotNull
    @Column(length = 12,nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date created_at;

    @Column(length = 12,nullable = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updated_at;

    @Column(nullable = true,length = 36)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UUID updated_by;

    @NotNull
    @Column(length = 20, nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status = Status.ACTIVATE;


    public void setId(UUID id) {
        this.id = id;
    }

    public void setCreated_at(Date created_at) {

        this.created_at = created_at;
    }

    public void setCreated_by(UUID created_by) {

        this.created_by = created_by;
    }

    public void setUpdated_at(Date updated_at) {

        this.updated_at = updated_at;
    }

    public void setUpdated_by(UUID updated_by) {

        this.updated_by = updated_by;
    }

    public UUID getId() {

        return id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public UUID getCreated_by() {

        return created_by;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public UUID getUpdated_by() {

        return updated_by;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
