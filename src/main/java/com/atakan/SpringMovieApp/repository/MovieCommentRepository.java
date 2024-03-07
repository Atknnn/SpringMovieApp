package com.atakan.SpringMovieApp.repository;

import com.atakan.SpringMovieApp.repository.entity.MovieComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCommentRepository extends JpaRepository<MovieComment,Long> {
}
