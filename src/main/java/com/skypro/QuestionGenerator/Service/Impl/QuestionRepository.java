package com.skypro.QuestionGenerator.Service.Impl;

import com.skypro.QuestionGenerator.Model.Question;

import java.util.Collection;

public interface QuestionRepository{
    boolean add(Question question);
    boolean remove(Question question);
    Collection<Question> getAll();

}
