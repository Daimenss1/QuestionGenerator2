package com.skypro.QuestionGenerator.Tests;


import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.Impl.JavaQuestionService;
import com.skypro.QuestionGenerator.Service.Impl.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {

    @Mock
    private QuestionRepository repository;

    @InjectMocks
    private JavaQuestionService out;


    public void turnDown (){
    }

    @Test
    void test_add() {
        Question question = new Question("test Question1", "test Answer1");

        assertTrue(out.add(question.getQuestion(), question.getAnswer()));
        assertFalse(out.add(question.getQuestion(), question.getAnswer()));
    }

    @Test
    void test_remove() {
    }

    @Test
    void test_gelAll() {
    }

    @Test
    void test_getRandomQuestion() {
    }
}
