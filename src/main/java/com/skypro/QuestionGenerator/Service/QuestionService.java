package com.skypro.QuestionGenerator.Service;

import com.skypro.QuestionGenerator.Model.Question;

import java.util.Collection;

public interface QuestionService {

    boolean add(String question, String answer);

    boolean remove(String question, String answer);

    Collection<Question> getAll();
    Question getRandomQuestion();

    int geSize();
}

