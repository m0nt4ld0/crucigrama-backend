package com.mmontaldo.crosswords_puzzle.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crosswords")
public class Crossword {

    @EmbeddedId
    private CrosswordId id;

    @ManyToOne
    @JoinColumn(name = "word_id", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonBackReference
    private Word word;

    private Integer sequenceNumber;

    private Integer isVword;

}
