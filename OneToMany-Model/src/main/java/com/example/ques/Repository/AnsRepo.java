package com.example.ques.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques.QueAns.AnsModel;

public interface AnsRepo extends JpaRepository<AnsModel, Integer> {

}
