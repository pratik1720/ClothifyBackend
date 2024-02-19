package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PostMapping("/acceptPickUpOrder")
	   public ResponseEntity<?> acceptPickUp(@RequestBody Order order){
		   
		        int order1=service.Update(order);
		   if(order1>0) {
			  
			  return ResponseEntity.ok(order1);
		   }
		   return ResponseEntity.noContent().build();
	   }
	@PutMapping("/completeOrder")
	   public ResponseEntity<?> completeOrder(@RequestBody Order order){
		   
		        service.complete(order);
		  
		   return ResponseEntity.noContent().build();
	   }
	@GetMapping("/orderDetails")
	public  ResponseEntity<List<Object>> getUsersDeta(){
	   
	 List<Object> ulist=service.getAllUserOrder();
	 System.out.println(ulist);
	 return ResponseEntity.ok(ulist);
	 
   }
}
