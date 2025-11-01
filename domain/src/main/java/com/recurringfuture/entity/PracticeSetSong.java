package com.recurringfuture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "practiceSetSong")
@Data
public class PracticeSetSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int songId;
    private int practiceSetId;

}
