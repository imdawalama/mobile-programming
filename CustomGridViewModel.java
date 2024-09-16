package com.example.jalbandi.model;

public class CustomGridViewModel {
    private String title;
    private int imageResId;
    public CustomGridViewModel(String title, int imageResId){
        this.title = title;
        this.imageResId = imageResId;
    }
    public String getTitle()
    {
        return title;
    }
    public int getImageResId()
    {
        return imageResId;
    }
}
