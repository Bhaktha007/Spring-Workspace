package com.example.railway.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.railway.RailwayData.StationInfo;

import jakarta.transaction.Transactional;

public interface SRepo extends JpaRepository<StationInfo, Integer> {
	StationInfo findBystname(String stname);
	public List<StationInfo> findBytrname(String trname);
	
	@Query(value="select * from station_table",nativeQuery=true)
	public List<StationInfo> getAllData();
	
	@Query(value="select *from station_table where stnid=id",nativeQuery=true)
	public List<StationInfo> bystnid(@Param("id")int id);
	
	@Query(value="select * from station_table stnid between:start and :end",nativeQuery=true)
	public List<StationInfo> startend(@Param("start")int start,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from station_table where stnid=?1 and stname=?2",nativeQuery=true)
	Integer deletebyId(@Param("id")int id,@Param("sname")String sname);
	
	@Modifying
	@Transactional
	@Query(value="=update from station_table set stnid=id where stname=sname",nativeQuery=true)
	public StationInfo update(@Param("id")int id,@Param("sname")String sname);

	//JPQL QUERY STATEMENT
	
	//Get By ID
	@Query("select i from StationInfo i where i.stname=?1")
	public StationInfo queryByType(@Param("name")String name);
	
	//Get Between
	@Query("select i from StationInfo i where i.stnid between ?1 and ?2")
	public List<StationInfo> between(@Param("start")int start,@Param("end")int end);
	
	//Get method using like
	@Query(value="select c from StationInfo c where c.trname like 'Mgr%'")
	public List<StationInfo> like();
	
	//Update using JPQL Query
	@Modifying
	@Transactional
	@Query(value="update StationInfo c set c.stname=?1 where c.stnid=?2")
	public StationInfo queryUpdateDetails(@Param("type")String type,@Param("id")int id);
	
	//Delete using JPQL Query
	@Modifying
	@Transactional
	@Query(value="delete from StationInfo i where i.stnid=?1")
	public void queryDelete(@Param("id")int id);

}
