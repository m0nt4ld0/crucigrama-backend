package com.mmontaldo.crosswords_puzzle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmontaldo.crosswords_puzzle.entity.Crossword;
import com.mmontaldo.crosswords_puzzle.entity.Word;
import com.mmontaldo.crosswords_puzzle.repository.CrosswordRepository;
import com.mmontaldo.crosswords_puzzle.repository.WordRepository;

import lombok.AllArgsConstructor;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CrosswordService {

    private final CrosswordRepository crosswordRepository;
    private final WordRepository wordRepository;

    public List<Word> getWordsByCrosswordId(Integer crosswordId) {
        List<Crossword> crosswords = crosswordRepository.findByIdIdCrossword(crosswordId);
        return crosswords.stream()
                         .map(Crossword::getWord)
                         .collect(Collectors.toList());
    }
}


