package com.skypro.QuestionGenerator.Tests;

import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.Impl.QuestionRepository;
import com.skypro.QuestionGenerator.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;


@ExtendWith(MockitoExtension.class)
class JavaQuestionService {

    @Mock
    private QuestionRepository repository;

    @InjectMocks
    private JavaQuestionService out;

    public void turnDown (){
    }

    @Test
    public void test_add() {
        Question question = new Question("test Question", "test Answer");
        when(repository.add(question)).thenReturn(true, false);

        assertTrue(out.add(question));
        assertFalse(out.add(question));
    }



    @Test
    public void test_remove(){
        String questionText = "test Question";
        String answerText = "test Answer";
        Question question = new Question(questionText, answerText);
        when(repository.remove(question)).thenReturn(true, false);

        assertTrue(out.remove(questionText, answerText));
        assertFalse(out.remove(questionText, answerText));

    }

    @Test
    public void test_get_all() {
        Set<Question> questions = Set.of(new Question("test Question", "test Answer"),
                (new Question("test Question2", "test Answer2" )));
        when(repository.getAll()).thenReturn(questions);

        assertEquals(out.getAll().size(), questions.size());
        assertTrue(out.getAll().containsAll(questions));
    }
    @Test
    public void test_get_random_question(){
        when(repository.getAll()).thenReturn(List.of(new Question("test Question", "test Answer"),
                new Question("test Question2", "test Answer2"),
                new Question("test Question3", "test Answer3")));

    Random randomMock = mock(Random.class);
    when(randomMock.nextInt(anyInt())).thenReturn(0,2);
    out.setRandom(randomMock);

    assertEquals(new Question("test Question", "test Answer"), out.getRandomQuestion());
    assertEquals(new Question("test Question3","test Answer3"), out.getRandomQuestion());
    }
}

