package com.example.c4.post.domain;

public class Post {
    private Long id;
    private String title;
    private String content;

    public Post(){}

    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
