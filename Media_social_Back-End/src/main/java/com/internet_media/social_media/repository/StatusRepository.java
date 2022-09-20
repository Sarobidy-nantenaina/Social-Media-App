package com.internet_media.social_media.repository;

import com.internet_media.social_media.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer> {

    Status save(Status status);
    ArrayList<Status> findAll();

}
