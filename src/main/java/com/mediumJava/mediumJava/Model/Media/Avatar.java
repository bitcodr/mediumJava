package com.mediumJava.mediumJava.Model.Media;

public class Avatar {

    private final String url;

    private final String type;

    private final ImageSize size;


    public Avatar(String url, String type, ImageSize size) {
        this.url = url;
        this.type = type;
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    public ImageSize getSize() {
        return size;
    }

}
