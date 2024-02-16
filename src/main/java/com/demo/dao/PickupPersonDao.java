package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Pickup;

@Repository
public interface PickupPersonDao extends JpaRepository<Pickup, Integer>{
	 @Query(value="select * from pickup  where username=:name and password=:pass",nativeQuery = true)
	Pickup checkPickup(String name, String pass);

}
