package com.internet_media.social_media.controller;

import com.internet_media.social_media.model.Usermedia;
import com.internet_media.social_media.service.UsermediaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@AllArgsConstructor
@Controller
@RequestMapping("/api/userService")
public class UsermediaController {

     private final UsermediaService usermediaService;

     @PostMapping("/save")
     public Usermedia saveUserMetaData(@RequestBody Usermedia usermedia){
         return usermediaService.submitMetaDataOfUser(usermedia);
     }

     @GetMapping("/getUserDetails")
     public ArrayList<Usermedia> getAllUserDetails(){
         return usermediaService.retrieveAllUserDetails();
     }

     @GetMapping("/getAllUsers/{user_id}")
     public Usermedia getUserDetail(@PathVariable("userId") int userId){
         return  usermediaService.getUserData(userId);
     }

}