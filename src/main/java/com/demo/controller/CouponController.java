package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Coupons;
import com.demo.service.CouponsService;

@CrossOrigin
@RestController
public class CouponController {
    @Autowired
	private CouponsService couponsService;
    
	@GetMapping("/allocatedCoupons/{uid}")
	public  ResponseEntity<List<Object>> getUsersDeta(@PathVariable int uid){
	   
	 List<Object> allocatedCoupons=couponsService.getAllUserCoupons(uid);
	
	 return ResponseEntity.ok(allocatedCoupons);
	 
   }
	@PostMapping("/addCoupons")
	public  ResponseEntity<?> getUsersDeta(@RequestBody Coupons coupon){
	   
	   Coupons couponNew=couponsService.addCoupon(coupon);
	
	 return ResponseEntity.ok(couponNew);
	 
   }
}
