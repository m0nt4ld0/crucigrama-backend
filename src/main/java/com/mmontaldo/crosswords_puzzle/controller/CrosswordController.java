package com.mmontaldo.crosswords_puzzle.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mmontaldo.crosswords_puzzle.dto.CrosswordDTO;
import com.mmontaldo.crosswords_puzzle.entity.Word;
import com.mmontaldo.crosswords_puzzle.service.CrosswordService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/crosswords")
public class CrosswordController {

    private final CrosswordService crosswordService;

    @GetMapping("/getById/{crosswordId}")
    public ResponseEntity<CrosswordDTO> getWordsByCrosswordId(@PathVariable Integer crosswordId) {
        List<Word> words = crosswordService.getWordsByCrosswordId(crosswordId);
        CrosswordDTO crosswordDTO = crosswordService.mapToDTO(words);
        return ResponseEntity.ok(crosswordDTO);
    }

    // ToDo: Get para conseguir significado de palabra por id de palabra
}
