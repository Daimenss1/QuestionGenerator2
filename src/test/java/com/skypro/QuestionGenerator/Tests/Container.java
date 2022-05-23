package com.skypro.QuestionGenerator.Tests;

import com.skypro.QuestionGenerator.Model.Question;

import java.util.Set;

public class Container {
    public static final String Question1 = "Q1";
    public static final String Question2 = "Q2";
    public static final String Question3 = "Q3";

    public static final String Answer1 = "A1";
    public static final String Answer2 = "A2";
    public static final String Answer3 = "A3";

    public static final Question FULL_QUESTION1 = new Question(Question1, Answer1);
    public static final Question FULL_QUESTION2 = new Question(Question2, Answer2);
    public static final Question FULL_QUESTION3 = new Question(Question3, Answer3);

    public static final Set<Question> TEST_QUESTIONS_SET_1 = Set.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3);
    public static final Set<Question> TEST_QUESTIONS_SET_2 = Set.of(FULL_QUESTION1);

    public static final String EMPTY_ANSWER = null;
}
