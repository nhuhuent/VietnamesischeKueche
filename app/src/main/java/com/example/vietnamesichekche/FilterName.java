package com.example.vietnamesichekche;

public class FilterName {

    private int image;
    private String deutschName;
    private String vietnamName;

    // constructor
    public FilterName(int image, String deutschName, String vietnamName) {
        this.image = image;
        this.deutschName = deutschName;
        this.vietnamName = vietnamName;
    }

    //getter setter
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDeutschName() {
        return deutschName;
    }

    public void setDeutschName(String deutschName) {
        this.deutschName = deutschName;
    }

    public String getVietnamName() {
        return vietnamName;
    }

    public void setVietnamName(String vietnamName) {
        this.vietnamName = vietnamName;
    }

}
