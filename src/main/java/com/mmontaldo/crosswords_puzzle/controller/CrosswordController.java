package com.mmontaldo.crosswords_puzzle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mmontaldo.crosswords_puzzle.entity.Word;
import com.mmontaldo.crosswords_puzzle.service.CrosswordService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/crosswords")
public class CrosswordController {

    private final CrosswordService crosswordService;

    @GetMapping("/{crosswordId}/words")
    public List<Word> getWordsByCrosswordId(@PathVariable Integer crosswordId) {
        return crosswordService.getWordsByCrosswordId(crosswordId);
    }
}
