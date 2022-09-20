package com.internet_media.social_media.service;


import com.internet_media.social_media.model.Status;
import com.internet_media.social_media.repository.StatusRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@AllArgsConstructor
@Slf4j
@Service
public class StatusService {


     private final StatusRepository statusRepository;

    public Status saveStatus(Status status){

        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime datetime = ZonedDateTime.now(zid);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "HH:mm:ss" );
        String timeStamp = datetime.format(formatter);

        status.setStatus_id(status.getStatus_id());
        status.setUploadTime(timeStamp);
        return statusRepository.save(status);


    }

    public ArrayList<Status> getAllStatus(){
        return statusRepository.findAll();
    }

}
