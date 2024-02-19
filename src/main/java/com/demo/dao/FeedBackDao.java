package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.PickupFeedBack;

@Repository
public interface FeedBackDao extends JpaRepository<PickupFeedBack, Integer> {

}
