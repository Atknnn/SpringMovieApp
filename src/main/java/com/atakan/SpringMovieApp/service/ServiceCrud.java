package com.atakan.SpringMovieApp.service;

import java.util.List;
import java.util.Optional;

public interface ServiceCrud<T> {
    T save(T t);
    Iterable<T> saveAll(Iterable<T> t);
    T update(T t);
    void delete(T t);
    void deleteById(Long id);
    List<T> findAll();
    Optional<T> findById(Long id);
}
