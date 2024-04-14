package com.example.cloudkolokvijum.model;


import jakarta.persistence.*;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Long year;

    // getters and setters
}