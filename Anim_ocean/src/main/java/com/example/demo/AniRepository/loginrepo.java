package com.example.demo.AniRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.AnimeList.Login;




public interface loginrepo extends JpaRepository<Login, Integer> {
	Login findByownername(String ownername);

}
