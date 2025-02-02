package com.mmontaldo.crosswords_puzzle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmontaldo.crosswords_puzzle.dto.CrosswordDTO;
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

    public CrosswordDTO mapToDTO(List<Word> words) {
        CrosswordDTO crosswordDTO = new CrosswordDTO();
        List<String> refs = new ArrayList<>();
        List<String> answers = new ArrayList<>();
    
        String palabraConVword = words.stream()
            .flatMap(word -> word.getCrosswords().stream())  
            .filter(crossword -> crossword.getIsVword() == 1)
            .map(crossword -> crossword.getWord().getWord())
            .findFirst()  
            .orElse(null);
    
        words.stream()
            .peek(wordEntity -> crosswordDTO.setVword(palabraConVword))
            .forEach(wordEntity -> {
                refs.add(wordEntity.getDescription());
                answers.add(wordEntity.getWord().toLowerCase());
            });
    
        crosswordDTO.setAnswers(answers);
        crosswordDTO.setRefs(refs);
        return crosswordDTO;
    }
    

}


