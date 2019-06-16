package com.mediumJava.mediumJava.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseModel {

    @NotBlank
    private UUID id, created_by;

    @NotBlank
    private int created_at;

    private int updated_at;

    private UUID updated_by;


    public BaseModel(UUID id, int created_at, UUID created_by, int updated_at, UUID updated_by) {
        this.id = id;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
    }

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

}