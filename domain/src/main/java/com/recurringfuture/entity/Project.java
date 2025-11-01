package com.recurringfuture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "project")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String title;
    private String description;
    private LocalDate creationDate;
    private LocalDate modificationDate;

    public Project() {

    }
}
