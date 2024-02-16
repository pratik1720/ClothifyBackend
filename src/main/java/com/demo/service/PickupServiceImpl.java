package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.PickupPersonDao;
import com.demo.model.Pickup;

@Service
public class PickupServiceImpl implements PickupService {
	@Autowired
   private PickupPersonDao pickupdao;
	@Override
	public Pickup findPickupPerson(String username, String password) {
		// TODO Auto-generated method stub
		 System.out.println(username);
		return pickupdao.checkPickup(username,password);
	}

}
