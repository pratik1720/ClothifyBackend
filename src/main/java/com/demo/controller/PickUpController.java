package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Order;
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
	 @GetMapping("/getPickUPPersons")
		public  ResponseEntity<List<Pickup>> getUsersDeta(){
		   
		 List<Pickup> pickUplist=pickupservice.getAllPickUpPersons();
		
		 return ResponseEntity.ok(pickUplist);
		 
	   }
	 @PostMapping("/addPickup")
	   public ResponseEntity<?> register(@RequestBody Pickup pickup){
		   
		        Pickup pickup1=pickupservice.add(pickup);
		   if(pickup1!=null) {
			  
			  return ResponseEntity.ok(pickup1);
		   }
		   return ResponseEntity.noContent().build();
	   }
}
