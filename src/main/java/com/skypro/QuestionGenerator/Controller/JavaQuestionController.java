package com.skypro.QuestionGenerator.Controller;

import com.skypro.QuestionGenerator.Model.Question;
import com.skypro.QuestionGenerator.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService javaQuestionService) {
        this.questionService = javaQuestionService;
    }

    @GetMapping("/add")
    public boolean add(String question, String answer) {
       return questionService.add(question, answer);
    }
    @GetMapping("/remove")
    public boolean remove(String question, String answer) {
       return questionService.remove(question, answer);
    }
    @GetMapping
    public Collection<Question> getAll(){
        return questionService.getAll();
    }
}
