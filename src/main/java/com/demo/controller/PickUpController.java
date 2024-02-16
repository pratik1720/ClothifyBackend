package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Pickup;
import com.demo.model.User;
import com.demo.service.PickupService;

@CrossOrigin
@RestController
public class PickUpController {
     @Autowired
	private PickupService pickupservice;
	 @PostMapping("/pickUplogin")
	   public ResponseEntity<?> login(@RequestBody Pickup pickup){
		 System.out.println(pickup);
		   Pickup pickup1 =pickupservice.findPickupPerson(pickup.getUsername(),pickup.getPassword());
		   
		   if(pickup1!=null) {
			 
			  return ResponseEntity.ok(pickup1);
		   }
		   return ResponseEntity.noContent().build();
	   }
}
