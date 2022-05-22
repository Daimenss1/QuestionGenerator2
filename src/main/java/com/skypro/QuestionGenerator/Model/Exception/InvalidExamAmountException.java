package com.skypro.QuestionGenerator.Model.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidExamAmountException extends IllegalArgumentException {

    public InvalidExamAmountException(int amount, int currentSize){
        super(String.format("Failed to Amount question", amount, currentSize));
    }

}
