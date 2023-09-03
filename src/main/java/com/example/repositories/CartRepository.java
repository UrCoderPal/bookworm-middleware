package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> 
{
	
	@Query (value="select * from cart where customer_customer_id=:customer",nativeQuery=true)
	List<Cart> findByCustomer(long customer);
	

	
	

}
