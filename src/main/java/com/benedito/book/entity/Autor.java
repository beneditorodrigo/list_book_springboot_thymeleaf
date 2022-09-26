package com.benedito.book.entity;

import javax.persistence.*;

@Table(name = "autor")
@Entity(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    public Autor(String nome){
        this.nome = nome;
    }
}
