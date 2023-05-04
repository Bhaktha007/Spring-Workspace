package com.example.ques.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques.QuestionAnswer.Questionmodel;

public interface Questionrepo extends JpaRepository<Questionmodel, Integer> {

}
