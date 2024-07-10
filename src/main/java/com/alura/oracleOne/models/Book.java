package com.alura.oracleOne.models;
import com.alura.oracleOne.DTOs.BookData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private int download_count;

    private Set<Language> languages;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<String> authors;

    public Book (BookData bookData){
        this.title = bookData.title();
        this.download_count = bookData.download_count();
    }

}
