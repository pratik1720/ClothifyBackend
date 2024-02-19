package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Order;



@Repository
public interface OrderDao extends JpaRepository<Order, Integer>{
	@Modifying
    @Transactional
    @Query(value="update pickuporder  set pid=:pid where oid=:oid",nativeQuery = true)
     int SetPickUp(int oid, int pid);
	
	 @Query(value=" select u.uid,u.username,u.email,c.brand,c.validity from user u  join  coupons c where u.uid=c.uid;",nativeQuery = true)
     List<Object> getallorders();
	

}
