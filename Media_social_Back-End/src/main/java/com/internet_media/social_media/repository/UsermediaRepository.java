package com.internet_media.social_media.repository;

import com.internet_media.social_media.model.Usermedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsermediaRepository extends JpaRepository<Usermedia,Integer>{
    Usermedia save(Usermedia usermedia);
    ArrayList<Usermedia> findAll();
    Usermedia findAllByUsermediaId(int usermediaId);
}
