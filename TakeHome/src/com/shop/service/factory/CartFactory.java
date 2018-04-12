package com.shop.service.factory;

import com.shop.service.CartService;
import com.shop.service.impl.CartServiceImpl;

public class CartFactory {

	public static CartService create(){
		CartService cartService = new CartServiceImpl();
		return cartService;
	}
}
