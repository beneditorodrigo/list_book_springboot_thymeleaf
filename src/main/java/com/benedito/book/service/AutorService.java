package com.benedito.book.service;

import com.benedito.book.entity.Autor;
import com.benedito.book.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public List<Autor> findAll(){
       return autorRepository.findAll();
    }
}