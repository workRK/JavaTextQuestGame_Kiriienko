package com.kiriienko.javatextquestgame_kiriienko;

import lombok.Data;

import java.util.List;

@Data
public class Question {

    private int id;
    private String questionText;
    private List<String> answers;
    private String correctChoice;
}
