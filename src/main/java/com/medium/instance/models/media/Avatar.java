package com.medium.instance.models.media;


import javax.persistence.Column;

public class Avatar {


    @Column(length = 400,nullable = false)
    private String url;

    @Column(length = 400,nullable = false)
    private String type;

    private ImageSize size;


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSize(ImageSize size) {
        this.size = size;
    }

    public ImageSize getSize() {
        return size;
    }

}
