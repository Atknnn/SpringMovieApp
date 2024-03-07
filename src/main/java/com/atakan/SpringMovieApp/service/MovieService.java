package com.atakan.SpringMovieApp.service;

import com.atakan.SpringMovieApp.repository.MovieRepository;
import com.atakan.SpringMovieApp.repository.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService implements ServiceCrud<Movie> {
    private final MovieRepository movieRepository;

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> saveAll(Iterable<Movie> t) {
        return movieRepository.saveAll(t);
    }

    @Override
    public Movie update(Movie movie) {
        return null;
    }

    @Override
    public void delete(Movie movie) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id);
    }
}
