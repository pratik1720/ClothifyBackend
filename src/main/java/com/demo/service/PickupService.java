package com.demo.service;

import java.util.List;

import com.demo.model.Pickup;

public interface PickupService {

	Pickup findPickupPerson(String username, String password);

	List<Pickup> getAllPickUpPersons();

	Pickup add(Pickup pickup);

}
