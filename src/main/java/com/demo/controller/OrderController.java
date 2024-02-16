package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Order;
import com.demo.model.User;
import com.demo.service.OrderService;
import com.demo.service.UserService;

@CrossOrigin
@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	@PostMapping("/order")
	   public ResponseEntity<?> acceptorder(@RequestBody Order order){
		   
		        Order order1=service.add(order);
		   if(order1!=null) {
			  
			  return ResponseEntity.ok(order1);
		   }
		   return ResponseEntity.noContent().build();
	   }
}
