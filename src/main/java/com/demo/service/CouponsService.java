package com.demo.service;

import java.util.List;

import com.demo.model.Coupons;

public interface CouponsService {

	List<Object> getAllUserCoupons(int uid);

	Coupons addCoupon(Coupons coupon);

}
