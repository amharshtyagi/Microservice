package com.question.services;

import com.question.entities.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Optional<Question> getOneQuestion(Long id);

    List<Question> getQuestionFromQuizId(Long quizId);
}
