package com.demo.service;

import java.util.List;

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
	@Override
	public List<Pickup> getAllPickUpPersons() {
		// TODO Auto-generated method stub
		return pickupdao.findAll();
	}
	@Override
	public Pickup add(Pickup pickup) {
		// TODO Auto-generated method stub
		return pickupdao.save(pickup);
	}

}
