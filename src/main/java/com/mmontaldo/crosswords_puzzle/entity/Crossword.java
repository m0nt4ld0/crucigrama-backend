package com.mmontaldo.crosswords_puzzle.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "crosswords")
public class Crossword {

    @EmbeddedId
    private CrosswordId id;

    @ManyToOne
    @JoinColumn(name = "word_id", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonBackReference
    private Word word;

    // Getters and Setters
    public Word getWord() {
        return word;
    }
}
