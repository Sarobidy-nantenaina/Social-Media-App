package com.internet_media.social_media.repository;

import com.internet_media.social_media.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {

    Comment save(Comment comment) ;

    ArrayList<Comment> findAllByPostID(int post_id);

}
