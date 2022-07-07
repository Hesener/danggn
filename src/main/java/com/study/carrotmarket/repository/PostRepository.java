package com.study.carrotmarket.repository;

import com.study.carrotmarket.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post add(Post post);
    Optional<Post> findById(Long post_id);
    List<Post> findAll();
}
