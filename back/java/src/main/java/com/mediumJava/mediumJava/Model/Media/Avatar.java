package com.mediumJava.mediumJava.Model.Media;

public class Avatar {

    private String url, type;

    private ImageSize size;

    
    public Avatar(String url, String type, ImageSize size) {
        this.url = url;
        this.type = type;
        this.size = size;
    }

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
