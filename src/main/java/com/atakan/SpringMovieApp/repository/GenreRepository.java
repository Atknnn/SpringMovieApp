package com.atakan.SpringMovieApp.repository;

import com.atakan.SpringMovieApp.repository.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {

    Optional<Genre> findOptionalByName(String name);
}
