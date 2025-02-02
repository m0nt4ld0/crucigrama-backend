package com.mmontaldo.crosswords_puzzle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmontaldo.crosswords_puzzle.entity.Crossword;
import com.mmontaldo.crosswords_puzzle.entity.CrosswordId;

public interface CrosswordRepository extends JpaRepository<Crossword, CrosswordId> {

    List<Crossword> findByIdIdCrossword(Integer idCrossword);

}
