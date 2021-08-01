package com.niteshjha.jsonplaceholderapi;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;

    private Integer id;

    private String title;

    @SerializedName("body")
    private String body;

    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.body = text;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return body;
    }
}