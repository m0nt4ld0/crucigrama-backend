package com.mmontaldo.crosswords_puzzle.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class CrosswordId implements Serializable {

    @Column(name = "id_word")
    private Integer idWord;

    @Column(name = "id_crossword")
    private Integer idCrossword;

}
