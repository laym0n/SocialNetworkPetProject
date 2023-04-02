package com.example.bllentitiessocialnetwork.dao;

import java.util.Optional;

public interface CRUDService<T> {
    void create(T entity);
    Optional<T> findById(int idEntity);
    void update(T entity);
    void delete(int idEntity);
    boolean contains(int idEntity);
}
