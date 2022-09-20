package com.internet_media.social_media.service;

import com.internet_media.social_media.model.Post;
import com.internet_media.social_media.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Temporal;
import java.security.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
@AllArgsConstructor
@Slf4j
@Service
public class PostService {

    private final PostRepository postRepository;

    public ArrayList<Post> submitPostToDB(Post postData){

        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime datetime = ZonedDateTime.now(zid);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "HH:mm:ss" );
        String timeStamp = datetime.format(formatter);

        postData.setLikes(0);
        postData.setPost_id(postData.getPost_id());
        postData.setDateTime(timeStamp);
        postRepository.save(postData);
        ArrayList<Post> result = retrievePostFromDB();
        return result;
    }

    public ArrayList<Post> retrievePostFromDB(){
        ArrayList<Post> result = postRepository.findAll();
        return result;
    }

    public ArrayList<Post> deletePostFromDB(int post_id){
        postRepository.deleteById(post_id);
        ArrayList<Post> result = retrievePostFromDB();
        return result;
    }
}


