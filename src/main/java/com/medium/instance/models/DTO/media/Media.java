package com.medium.instance.models.DTO.media;

import com.medium.instance.models.MediaPrefix;
import com.medium.instance.models.MediaSizeType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Media implements Serializable {

    @NotNull
    @Size(min = 1,max = 400)
    private String url;

    @NotNull
    @Enumerated(EnumType.STRING)
    private MediaPrefix prefix;

    @NotNull
    private int width, height,weight;

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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public MediaSizeType getMediaSizeType() {
        return mediaSizeType;
    }

    public void setMediaSizeType(MediaSizeType mediaSizeType) {
        this.mediaSizeType = mediaSizeType;
    }
}
