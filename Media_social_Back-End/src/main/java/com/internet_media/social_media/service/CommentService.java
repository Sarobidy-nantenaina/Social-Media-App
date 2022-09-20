package com.internet_media.social_media.service;


import com.internet_media.social_media.model.Comment;
import com.internet_media.social_media.repository.CommentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
@AllArgsConstructor
@Slf4j
@Service
public class CommentService {


    private final CommentRepository commentRepository;

    public Comment saveComment(Comment comment){

        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime datetime = ZonedDateTime.now(zid);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "HH:mm:ss" );
        String timeStamp = datetime.format(formatter);

        comment.setComment(comment.getComment());
        comment.setDateComment(timeStamp);
        return commentRepository.save(comment);

    }

    public ArrayList<Comment> getAllComment(int post_id){
        return commentRepository.findAllByPostID(post_id);
    }

}
