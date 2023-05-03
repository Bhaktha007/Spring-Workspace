package com.example.anime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.anime.Model.loginmodel;

public interface loginRepo extends JpaRepository<loginmodel, Integer> {
	loginmodel findByownername(String ownername);

}
