package com.recurringfuture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Entity(name = "song")
@Data
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String title;
    private String composer;
    private String key;
    private String tuning;
    private int capo;
    private int tempo;
    private String genre;
    private String duration;
    private int state;
    private int threshold;
    private Boolean alert;
    private LocalDate creationDate;
    private LocalDate modificationDate;
    private LocalDate lastPerformedDate;
    private int count;

    public Song() {

    }
}
