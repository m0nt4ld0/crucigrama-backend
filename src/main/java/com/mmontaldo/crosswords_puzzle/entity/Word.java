package com.mmontaldo.crosswords_puzzle.entity;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String word;
    
    private String description;

    @OneToMany(mappedBy = "word", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Crossword> crosswords;

}
