package com.study.carrotmarket.service;

import com.study.carrotmarket.domain.Post;
import com.study.carrotmarket.repository.PostRepository;

import java.util.List;

public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Long write(Post post) {
        postRepository.add(post);
        return post.getPost_id();
    }

    public List<Post> findPosts() {
        return postRepository.findAll();
    }
}
