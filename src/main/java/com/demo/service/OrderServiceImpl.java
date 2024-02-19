package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.OrderDao;

import com.demo.model.Order;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderdao;
	@Override
	public Order add(Order order) {
		// TODO Auto-generated method stub
		return orderdao.save(order);
	}
	@Override
	public int Update(Order order) {
		// TODO Auto-generated method stub
		return orderdao.SetPickUp(order.getOid(),order.getPid().getPid());
	}
	@Override
	public void complete(Order order) {
		// TODO Auto-generated method stub
		orderdao.deleteById(order.getOid());
		
	}
	@Override
	public List<Object> getAllUserOrder() {
		// TODO Auto-generated method stub
		return orderdao.getallorders();
	}

}
