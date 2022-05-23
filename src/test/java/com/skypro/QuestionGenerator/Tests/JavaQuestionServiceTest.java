package com.skypro.QuestionGenerator.Tests;


import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.Impl.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;

import static com.skypro.QuestionGenerator.Tests.Container.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {


    private final JavaQuestionService out = new JavaQuestionService();




    @Test
    void shouldAddQuestion() {
        out.add("Q1", "A1");
        assertTrue(out.getAll().contains(new Question("q1", "a1")));
    }

    @Test
    void test_remove() {
        out.remove("Q2", "A2");
        assertTrue(out.getAll().contains(FULL_QUESTION2));
    }

    @Test
    void test_gelAll() {
        out.add("Q1", "A1");
        out.add("Q2", "A2");
        out.add("Q3", "A3");
        assertTrue(out.getAll().containsAll(List.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3)));

    }
    @Test
    void test_getRandomQuestion(){
        out.add("Q1", "A1");
        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(0);
        out.setRandom(random);
        assertEquals(FULL_QUESTION1, out.getRandomQuestion());
    }
}
