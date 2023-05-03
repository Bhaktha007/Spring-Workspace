package com.example.demo.AnimeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.AnimeList.Alist;

public interface AnimeRepo extends JpaRepository<Alist, Integer> {

}
