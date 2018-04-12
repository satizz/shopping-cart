package com.shop.service;

import java.util.List;

import com.shop.model.Cart;

public interface CartService {

	public int getStock(int productId);
	
	public List<Cart> getProducts(int userId);
	
	public int getTotal(int userId);
	
}
