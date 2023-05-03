package com.example.anime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.anime.Model.AnimeModel;

public interface AnimeRepo extends JpaRepository<AnimeModel, Integer> {

}
