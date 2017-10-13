package com.glumes.sample.imageitem;

/**
 * @author glumes
 */

public class ImageModel {

    public String imageUrl;

    public int drawableId;

    public String description;

    public ImageModel(String imageUrl, String description) {
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public ImageModel(int drawableId, String description) {
        this.drawableId = drawableId;
        this.description = description;
    }
}
