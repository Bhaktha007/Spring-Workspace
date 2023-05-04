package com.example.ques.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques.QueAns.QuesModel;

public interface QuesRepo extends JpaRepository<QuesModel, Integer> {

}
