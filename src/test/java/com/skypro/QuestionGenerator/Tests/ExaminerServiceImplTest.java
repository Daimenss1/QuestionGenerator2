package com.skypro.QuestionGenerator.Tests;

import com.skypro.QuestionGenerator.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static com.skypro.QuestionGenerator.Tests.Container.TEST_QUESTIONS_SET_2;
import static com.skypro.QuestionGenerator.Tests.Container.FULL_QUESTION1;
@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    QuestionService mock;

    @InjectMocks
    ExaminerServiceImplTest out;

    @Test
     public void getQuestionsTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION1);
        assertEquals(TEST_QUESTIONS_SET_2,out.getQuestions(1));
    }



}