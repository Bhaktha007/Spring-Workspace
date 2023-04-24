package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Example.ExPrgm;

public interface ExRepo extends JpaRepository<ExPrgm,Integer> {

}
