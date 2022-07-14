package com.study.carrotmarket.repository;

import com.study.carrotmarket.domain.Address;
import com.study.carrotmarket.domain.Member;
import com.study.carrotmarket.domain.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Repository
public class PostRepository {

    @PersistenceContext
    private static EntityManager em;

    public void save(Post post) {
        if (post.getId() == null) {
            em.persist(post);
        } else {
            em.merge(post);
        }
    }

    public static Post findOne(Long id) {
        return em.find(Post.class, id);
    }

    public List<Post> findAll() {
        return em.createQuery("select m from Post m", Post.class)
                .getResultList();
    }

    public List<Post> findByName(String name) {
        return em.createQuery("select m from Post m where m.name = :name", Post.class)
                .setParameter("name", name)
                .getResultList();
    }

    public List<Post> findByAddress(Address address) {
        return em.createQuery("select m from Post m where m.address = :address", Post.class)
                .setParameter("address", address)
                .getResultList();
    }

}
