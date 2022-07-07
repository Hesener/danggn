package com.study.carrotmarket.domain;

public class Post {

    private Long post_id; //pk

    private String title;

    private String content;

    private String user_id;

    private String address_id;

    private Boolean status;

    public Long getPost_id() {
        return post_id;
    }
    public void setPost_id(Long post_id) {
        this.post_id = post_id;
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

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAddress_id() {
        return address_id;
    }
    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
