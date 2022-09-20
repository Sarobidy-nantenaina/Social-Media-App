package com.internet_media.social_media.controller;

import com.internet_media.social_media.model.Status;
import com.internet_media.social_media.service.StatusService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/api/statusService")
public class StatusController {


    private final StatusService statusService;

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status){
        return statusService.saveStatus(status);
    }

    @GetMapping("/getAllStatus")
    public ArrayList<Status> getAllStatus(){
        return statusService.getAllStatus();
    }
}
