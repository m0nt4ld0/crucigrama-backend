package com.mmontaldo.crosswords_puzzle.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CrosswordDTO {
    private String vword;
    private List<String> refs;
    private List<String> answers;
}
