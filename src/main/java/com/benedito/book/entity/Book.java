package com.benedito.book.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name = "book")
@Entity(name = "book")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Book(String nome, Autor autor){
        this.nome = nome;
        this.autor = autor;
    }
}
