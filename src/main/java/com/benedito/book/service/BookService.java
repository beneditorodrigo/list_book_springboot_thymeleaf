package com.benedito.book.service;

import com.benedito.book.entity.Book;
import com.benedito.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void save(@Valid Book book){
        this.bookRepository.save(book);
    }

    public List<Book> listarBooks(){
        return (List<Book>) bookRepository.findAll();
    }
}
