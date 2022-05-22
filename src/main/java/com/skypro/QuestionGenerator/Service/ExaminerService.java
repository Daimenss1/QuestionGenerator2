package com.skypro.QuestionGenerator.Service;

import com.skypro.QuestionGenerator.Model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
