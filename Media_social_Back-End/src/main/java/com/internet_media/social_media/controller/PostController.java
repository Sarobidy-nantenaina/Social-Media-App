package com.internet_media.social_media.controller;


import com.internet_media.social_media.model.Post;
import com.internet_media.social_media.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/postService")
public class PostController {

    private final PostService postService;

    @PostMapping("/save")
    public ArrayList<Post> submitPost(@RequestBody Post body){
        ArrayList<Post> result = postService.submitPostToDB(body);
        return result;
    }

    @GetMapping("/getPost")
    public ArrayList<Post>retrievAllPost(){
        ArrayList<Post> result = postService.retrievePostFromDB();
        return result;
    }

    @DeleteMapping("/delete")
    public ArrayList<Post> deleteParticularPost(@PathVariable("post_id") int post_id){
        ArrayList<Post> result = postService.deletePostFromDB(post_id);
        return result;
    }
}


