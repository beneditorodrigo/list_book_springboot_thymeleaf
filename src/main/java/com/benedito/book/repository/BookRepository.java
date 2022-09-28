package com.benedito.book.repository;

import com.benedito.book.entity.Book;
import org.springframework.data.repository.CrudRepository;

import javax.validation.OverridesAttribute;
import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    List<Book> findAll();
}
