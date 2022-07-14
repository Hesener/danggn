package com.study.carrotmarket.service;

import com.study.carrotmarket.domain.Address;
import com.study.carrotmarket.domain.Post;
import com.study.carrotmarket.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {

    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }

    public Post findOne(Long postId) {
        return postRepository.findOne(postId);
    }

    public List<Post> findPosts() {
        return postRepository.findAll();
    }

    public List<Post> findByName(String postName) {
        return postRepository.findByName(postName);
    }

    public List<Post> findByAddress(Address address) {
        return postRepository.findByAddress(address);
    }





}
