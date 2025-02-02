package com.mmontaldo.crosswords_puzzle.entity;

import jakarta.persistence.*;

@Entity
public class Crossword {

    @EmbeddedId
    private CrosswordId id;

    @ManyToOne
    @JoinColumn(name = "word_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Word word;

    // Getters and Setters
    public Word getWord() {
        return word;
    }
}
