package com.ly.service;

import com.ly.pojo.Order;

public interface OrderService {
	//根据订单id,获取订单信息
	Order getOrder(String orderId);

	//保存订单
	void addOrder(Order order);
}
