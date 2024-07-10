package com.alura.oracleOne.models;

import com.alura.oracleOne.DTOs.AuthorData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int birth_year;

    private int death_year;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Book> books;

    public Author(AuthorData authorData){
        this.name = authorData.name();
        this.birth_year = authorData.birth_year();
        this.death_year = authorData.death_year();
    }

}
