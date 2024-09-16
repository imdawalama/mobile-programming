package com.example.jalbandi.model;

public class CustomModel {
    private String title;
    private String description;
    private int imageResId;

    public CustomModel(String title, String description, int imageResId){
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.title = description;
    }
    public int getImageResId(){
        return imageResId;
    }
    public void setImageResId(int imageResId){
        this.imageResId = imageResId;
    }

}
