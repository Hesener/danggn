package com.study.carrotmarket.repository;

import com.study.carrotmarket.domain.Post;

import java.lang.reflect.Array;
import java.util.*;

public class MemoryPostRepository implements PostRepository{
    private static Map<Long, Post> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Post add(Post post) {
        post.setPost_id(++sequence);
        store.put(post.getPost_id(), post);
        return post;
    }

    @Override
    public Optional<Post> findById(Long post_id) {
        return Optional.ofNullable(store.get(post_id));
    }

    public List<Post> findAll() {
        return new ArrayList<>(store.values());
    }
}
