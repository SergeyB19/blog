package com.itproger.blog.models;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anonse, full_text;
    private int views;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnonse() {
        return anonse;
    }

    public void setAnonse(String anonse) {
        this.anonse = anonse;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Post() {
    }

    public Post(String title, String anonse, String full_text) {
        this.title = title;
        this.anonse = anonse;
        this.full_text = full_text;
    }
}
