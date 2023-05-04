package com.example.ques.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques.QuestionAnswer.Answermodel;

public interface AnswerRepo extends JpaRepository<Answermodel, Integer> {

}
