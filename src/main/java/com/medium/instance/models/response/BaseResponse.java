package com.medium.instance.models.response;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

public class BaseResponse implements Serializable {

    public static final long serialVersionUID = 2129798182969054376L;

    @NotNull
    @Id
    protected UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
