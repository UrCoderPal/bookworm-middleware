package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;
import com.example.services.MyShelfService;

@RestController
@RequestMapping("/api/myshelf")
public class MyShelfController {

	@Autowired
	MyShelfService myShelfService;

	@GetMapping("/{id}")
	public ResponseEntity<MyShelf> getById(@PathVariable Long id) {
		MyShelf shelf = myShelfService.getById(id);
		if (shelf != null) {
			return ResponseEntity.ok(shelf);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/customer/{customerId}")
    public ResponseEntity<List<ProductMaster>> getByCustomerId(@PathVariable Long customerId) {
//    	ArrayList<MyShelfDto> list = new ArrayList<>();
//
//		ArrayList<ProductMaster> cartList = myShelfService.getByCustomerId(customerId);
//
//		for (Cart cartItem : cartList) {
//			CartSendDto obj = new CartSendDto();
//			obj.setId(cartItem.getCartId());
//			obj.setPrice(cartItem.getProduct().getProductSpCost());
//			obj.setProductName(cartItem.getProduct().getProductName());
//			obj.setQuantity(cartItem.getQuantity());
//			obj.setTotalPrice(cartItem.getQuantity() * cartItem.getProduct().getProductSpCost());
//			obj.setType(cartItem.getType());
//
//			list.add(obj);
//		}
//		return list;
		
		return (ResponseEntity<List<ProductMaster>>) myShelfService.getByCustomerId(customerId);

    }
}
