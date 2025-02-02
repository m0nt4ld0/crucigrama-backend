package com.mmontaldo.crosswords_puzzle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmontaldo.crosswords_puzzle.entity.Word;

public interface WordRepository extends JpaRepository<Word, Integer> {
}