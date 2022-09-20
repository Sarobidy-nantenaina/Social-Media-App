package com.internet_media.social_media.repository;

import com.internet_media.social_media.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
    ArrayList<Post> findAll();
    Post save(Post post);
    void deleteById(int post_id);
}

