package com.example.c4.post.dto;

public class PostDTO {
    //DTO - Data Transfer Object. 즉 Object와 Object 사이에 데이터를 전달하기 위한 객체다.
    //이 객체는 파라미터 값들을 담고 있다. 껍닥

    private Long id;
    private String title;
    private String content;

    public PostDTO(){}

    public PostDTO(String title, String content){
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
