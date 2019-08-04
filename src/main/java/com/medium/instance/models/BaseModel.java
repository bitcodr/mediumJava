package com.medium.instance.models;


import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class BaseModel {


    @NotNull
    private UUID id, created_by;

    @NotNull
    private int created_at;

    private int updated_at;

    private UUID updated_by;

    @Column(columnDefinition = Status.ACTIVATE)
    private Status status;


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
