package com.internet_media.social_media.service;

import com.internet_media.social_media.model.Usermedia;
import com.internet_media.social_media.repository.UsermediaRepository;
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
public class UsermediaService {


     private final UsermediaRepository usermediaRepository;

     public Usermedia submitMetaDataOfUser(Usermedia usermedia){

         ZoneId zid = ZoneId.systemDefault();
         ZonedDateTime datetime = ZonedDateTime.now(zid);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "HH:mm:ss" );
         String timeStamp = datetime.format(formatter);

         usermedia.setActive(true);
         usermedia.setJoiningDate(timeStamp);

         return usermediaRepository.save(usermedia);
     }

     public ArrayList<Usermedia> retrieveAllUserDetails(){
         return usermediaRepository.findAll();
     }

     public Usermedia getUserData(int usermediaId){
         return usermediaRepository.findAllByUsermediaId(usermediaId);
     }

}
