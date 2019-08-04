package com.medium.instance.models.media;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

public class ImageSize {

    @NotNull
    @Column(nullable = false)
    private float width, height;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ImageSizeType imageSizeType;

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
