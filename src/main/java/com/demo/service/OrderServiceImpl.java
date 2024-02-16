package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.OrderDao;

import com.demo.model.Order;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao dao;
	@Override
	public Order add(Order order) {
		// TODO Auto-generated method stub
		return dao.save(order);
	}

}
