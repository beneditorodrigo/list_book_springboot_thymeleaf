package com.benedito.book.repository;

import com.benedito.book.entity.Autor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AutorRepository extends CrudRepository<Autor, Long> {

    @Override
    List<Autor> findAll();
}
