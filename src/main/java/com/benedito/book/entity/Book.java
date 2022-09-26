package com.benedito.book.entity;

import javax.persistence.*;

@Table(name = "book")
@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
