package com.medium.instance.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class BaseModel {


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
    private int created_at;

    @Column(length = 12,nullable = true)
    private int updated_at;

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

    public void setCreated_at(int created_at) {

        this.created_at = created_at;
    }

    public void setCreated_by(UUID created_by) {

        this.created_by = created_by;
    }

    public void setUpdated_at(int updated_at) {

        this.updated_at = updated_at;
    }

    public void setUpdated_by(UUID updated_by) {

        this.updated_by = updated_by;
    }

    public UUID getId() {

        return id;
    }

    public int getCreated_at() {
        return created_at;
    }

    public UUID getCreated_by() {

        return created_by;
    }

    public int getUpdated_at() {
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
