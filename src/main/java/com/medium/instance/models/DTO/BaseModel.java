package com.medium.instance.models.DTO;


import com.medium.instance.models.Status;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class BaseModel {

    @Id
    @NotNull
    @Column(nullable = false, unique = true)
    private UUID id;


    @NotNull
    @Column(length = 20, nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status = Status.ACTIVATE;


    public void setId(UUID id) {
        this.id = id;
    }


    public UUID getId() {

        return id;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
