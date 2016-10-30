package com.test.testprofileproject;

/**
 * Created by bogdan on 8/30/16.
 */
public class Image {
    private String count;
    private int imageResource;

    public Image(String count, int imageResource) {
        this.count = count;
        this.imageResource = imageResource;
    }

    public String getCount() {
        return count;
    }

    public int getImageResource() {
        return imageResource;
    }
}
