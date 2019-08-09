package com.medium.instance.models.entity;

import com.medium.instance.models.MediaPrefix;
import com.medium.instance.models.MediaSizeType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity(name = "media")
public class MediaEntity extends BaseEntity {

    @NotNull
    @Size(min = 1,max = 400)
    @Column(length = 400,nullable = false, updatable = true)
    private String url;

    @NotNull
    @Column(nullable = false,updatable = true)
    @Enumerated(EnumType.STRING)
    private MediaPrefix prefix;

    @NotNull
    @Column(nullable = false, updatable = true, length = 11)
    private int height;

    @NotNull
    @Column(nullable = false, updatable = true, length = 11)
    private int weight;


    @Column(name = "size_type",nullable = false,updatable = true)
    @Enumerated(EnumType.STRING)
    @NotNull
    private MediaSizeType sizeType;

    @NotNull
    @Column(name = "reference_id",nullable = false,updatable = false)
    private UUID referenceID;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public MediaPrefix getPrefix() {
        return prefix;
    }

    public void setPrefix(MediaPrefix prefix) {
        this.prefix = prefix;
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

    public MediaSizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(MediaSizeType sizeType) {
        this.sizeType = sizeType;
    }

    public UUID getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(UUID referenceID) {
        this.referenceID = referenceID;
    }
}
