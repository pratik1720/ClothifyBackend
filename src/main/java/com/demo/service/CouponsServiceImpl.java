package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CouponsDao;
import com.demo.model.Coupons;

@Service
public class CouponsServiceImpl implements CouponsService {
    @Autowired
	private CouponsDao couponsdao;
	@Override
	public List<Object> getAllUserCoupons(int uid) {
		// TODO Auto-generated method stub
		return couponsdao.getCoupons(uid);
	}
	@Override
	public Coupons addCoupon(Coupons coupon) {
		// TODO Auto-generated method stub
		return couponsdao.save(coupon);
	}

	
}
