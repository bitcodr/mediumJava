package com.medium.instance.models.media;


import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Avatar {


    @NotNull
    @Size(min = 1,max = 400)
    @Column(length = 400,nullable = false)
    private String url;

    @NotNull
    @Size(min = 1, max = 10)
    @Column(length = 10,nullable = false)
    private String type;

    @NotNull
    @OneToOne
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
