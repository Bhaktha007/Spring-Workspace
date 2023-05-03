package com.example.demo.AniRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.AnimeList.Alist;

import jakarta.transaction.Transactional;

public interface AniRepo extends JpaRepository<Alist, Integer> {
	Alist findByusername(String username);
	
    public List<Alist> findByAname(String  Aname);
	
	@Query(value="select * from anime_complex", nativeQuery= true)
	public List<Alist> getAllData();
	
	@Query(value="select * from anime_complex where userid=:id", nativeQuery= true)
	public List<Alist> byuserid(@Param("id")int id);
	
	@Query(value="select * from anime_complex where userid between :start and :end",nativeQuery= true)
	public List<Alist> startend(@Param("start") int start ,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from anime_complex where userid=?1 and username=?2",nativeQuery= true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);

	@Modifying
	@Transactional
	@Query(value="update anime_complex set userid=:id where username=:uname",nativeQuery= true)
	public void updateDetails(@Param("id")int id,@Param("uname")String uname);


}
