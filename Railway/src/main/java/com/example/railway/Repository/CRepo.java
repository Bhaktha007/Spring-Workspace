package com.example.railway.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.railway.RailwayData.CustomerInfo;

import jakarta.transaction.Transactional;

public interface CRepo extends JpaRepository<CustomerInfo, Integer> {
	CustomerInfo findBycusname(String cusname);
	public List<CustomerInfo> findBycusgen(String cusgen);
	
	@Query(value="select * from customer_table",nativeQuery=true)
	public List<CustomerInfo> getAllData();
	
	@Query(value="select * from customer_table where cusid=id",nativeQuery=true)
	public List<CustomerInfo> bycusid(@Param("id")int id);
	
	@Query(value="select * from customer_table cusid between:start and :end",nativeQuery=true)
	public List<CustomerInfo> startend(@Param("start")int start,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from customer_table where cusid=?1 and cusname=?2",nativeQuery=true)
	 Integer deletebyId(@Param("id")int id,@Param("cname")String cname);
	
	@Modifying
	@Transactional
	@Query(value="update from customer_table set cusid=id where cusname=cname",nativeQuery=true)
	public CustomerInfo update(@Param("id")int id,@Param("cname")String cname);
	
	//JPQL QUERY STATEMENT
	
			//Get By ID
			@Query("select i from CustomerInfo i where i.cusname=?1")
			public CustomerInfo queryByTypeD(@Param("name")String name);
			
			//Get Between
			@Query("select i from CustomerInfo i where i.cusid between ?1 and ?2")
			public List<CustomerInfo> betweenD(@Param("start")int start,@Param("end")int end);
			
			//Get method using like
			@Query(value="select c from CustomerInfo c where c.trnid like '21%'")
			public List<CustomerInfo> Dlike();
			
			//Update using JPQL Query
			@Modifying
			@Transactional
			@Query(value="update CustomerInfo c set c.cusname=?1 where c.cusid=?2")
			public CustomerInfo queryUpdateDetails(@Param("type")String type,@Param("id")int id);
			
			//Delete using JPQL Query
			@Modifying
			@Transactional
			@Query(value="delete from CustomerInfo i where i.cusid=?1")
			public void queryDeleteD(@Param("id")int id);

}
