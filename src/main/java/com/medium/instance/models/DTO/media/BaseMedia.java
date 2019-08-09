package com.medium.instance.models.DTO.media;

import com.medium.instance.models.MediaPrefix;
import com.medium.instance.models.MediaSizeType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class BaseMedia implements Serializable {

    @NotNull
    @Size(min = 1,max = 400)
    private String url;

    @NotNull
    @Enumerated(EnumType.STRING)
    private MediaPrefix prefix;

    @NotNull
    private float width, height,weight;

    @NotNull
    @Enumerated(EnumType.STRING)
    private MediaSizeType mediaSizeType;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MediaPrefix getPrefix() {
        return prefix;
    }

    public void setPrefix(MediaPrefix prefix) {
        this.prefix = prefix;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public MediaSizeType getMediaSizeType() {
        return mediaSizeType;
    }

    public void setMediaSizeType(MediaSizeType mediaSizeType) {
        this.mediaSizeType = mediaSizeType;
    }
}
