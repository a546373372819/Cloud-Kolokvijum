package com.example.cloudkolokvijum.service;

import com.example.cloudkolokvijum.model.Film;
import com.example.cloudkolokvijum.repository.FilmRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }
}
