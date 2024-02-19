package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Coupons;

@Repository
public interface CouponsDao extends JpaRepository<Coupons, Integer>{
	 @Query(value=" select uid,username,name,email,phone_no,address, role,pid ,cid,brand,discount ,validity from user natural join coupons where uid=:uid",nativeQuery = true)
      List<Object> getCoupons(int uid);


}