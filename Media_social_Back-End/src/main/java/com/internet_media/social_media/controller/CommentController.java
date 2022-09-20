package com.internet_media.social_media.controller;

import com.internet_media.social_media.model.Comment;
import com.internet_media.social_media.model.Status;
import com.internet_media.social_media.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/api/commentService")
public class CommentController {


    private final CommentService commentService;

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComments/{post_id}")
    public ArrayList<Comment> getAllComment(@PathVariable("post_id") int post_id){
        return commentService.getAllComment(post_id);
    }
}
