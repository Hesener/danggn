package com.study.carrotmarket.controller;

import com.study.carrotmarket.domain.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostApiController {

    @PostMapping("/post/{id}")
    public Post write(@RequestParam("title") String title) {
        Post post = new Post();
        post.setTitle(title);
        return post;
    }

    @GetMapping("post")
    public List<Post> findPosts() {
        return findPosts();
    }
}
