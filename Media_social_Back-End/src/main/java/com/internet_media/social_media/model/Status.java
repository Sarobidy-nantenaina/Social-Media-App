package com.internet_media.social_media.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table
public class Status implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int status_id;
    private int user_id;
    private String statusImageURL;
    private String uploadTime;

}
