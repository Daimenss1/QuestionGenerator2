package com.skypro.QuestionGenerator.Service.Impl;

import com.skypro.QuestionGenerator.Model.Exception.InvalidExamAmountException;
import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.ExaminerService;
import com.skypro.QuestionGenerator.Service.QuestionService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;


@Service
public class ExaminerServiceImpl implements ExaminerService {

    private static final Logger log = (Logger) LoggerFactory.getLogger(ExaminerServiceImpl.class);

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        int size = questionService.geSize();
        if (amount <= 0 || size < amount) {
            log.error("Amount must be positive" + size);
            throw new InvalidExamAmountException(amount, size);
        }
        Set<Question> questions = new HashSet<>();
        while(questions.size() < amount){
            questions.add(questionService.getRandomQuestion());
        }
        log.info( "The following random question for amount", amount, questions);
        return questions;
    }
}