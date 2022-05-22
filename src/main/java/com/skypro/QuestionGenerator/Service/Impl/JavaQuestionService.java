package com.skypro.QuestionGenerator.Service.Impl;

import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private static final Set<Question> questionStorage = new HashSet<>();
    private final Random random = new Random();


    @Override
    public boolean add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return questionStorage.add(newQuestion);
    }

    @Override
    public boolean remove(String question, String answer) {
        return questionStorage.remove(new Question(question, answer));
    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionStorage);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionStorage).get(random.nextInt(questionStorage.size()));
    }

    @Override
    public int geSize() {
        return questionStorage.size();
    }
}
