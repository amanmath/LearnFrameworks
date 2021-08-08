package com.aman.moviestore.controller;

import com.aman.moviestore.entity.Movie;
import com.aman.moviestore.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepo repo;

    @GetMapping(path = "")
    public List<Movie> findAll(){
        return repo.findAll();
    }
}
