package com.mediumJava.mediumJava.Model;

import java.util.UUID;

public class BaseModel {

    protected final UUID id;

    protected final int created_at;

    protected final UUID created_by;

    protected final int updated_at;

    protected final UUID updated_by;


    public BaseModel(UUID id, int created_at, UUID created_by, int updated_at, UUID updated_by) {
        this.id = id;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
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
