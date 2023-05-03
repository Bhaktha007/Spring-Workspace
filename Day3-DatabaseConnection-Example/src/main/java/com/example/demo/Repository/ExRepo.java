package com.example.demo.Repository;

import java.util.List; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Example.ExPrgm;

import jakarta.transaction.Transactional;

public interface ExRepo extends JpaRepository<ExPrgm,Integer> {
	@Query(value= "select * from ExPrgm",nativeQuery = true)
	public List<ExPrgm> getAllData();
	
	@Query(value="select * from ExPrgm where sid=:id",nativeQuery = true)
	public List<ExPrgm> bysname(@Param("id")int id);
	
	@Query(value ="select * from ExPrgm where sid between ?1 and ?2",nativeQuery = true)
	List<ExPrgm> startEnd(@Param("start") int start,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from ExPrgm where sid=?1 and sname=?2",nativeQuery = true)
	Integer deleteID(@Param("id")int sid,@Param("name")String sname);

}

