package com.mmontaldo.crosswords_puzzle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmontaldo.crosswords_puzzle.entity.Crossword;
import com.mmontaldo.crosswords_puzzle.entity.Word;
import com.mmontaldo.crosswords_puzzle.repository.CrosswordRepository;
import com.mmontaldo.crosswords_puzzle.repository.WordRepository;

import java.util.stream.Collectors;

@Service
public class CrosswordService {

    @Autowired
    private CrosswordRepository crosswordRepository;

    @Autowired
    private WordRepository wordRepository;

    public List<Word> getWordsByCrosswordId(Integer crosswordId) {
        // Buscar los crosswords con el id_crossword proporcionado
        List<Crossword> crosswords = crosswordRepository.findByIdIdCrossword(crosswordId);

        // Extraer las palabras asociadas a esos crosswords
        return crosswords.stream()
                         .map(Crossword::getWord)  // Obtener la palabra asociada
                         .collect(Collectors.toList());
    }
}


