package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.AnimeList.Alist;

public interface ARepo extends JpaRepository<Alist, Integer> {

}
