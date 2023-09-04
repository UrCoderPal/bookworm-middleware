package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.BeneficiaryMaster;
import com.example.entities.InvoiceTable;
import com.example.entities.ProductMaster;
import com.example.entities.RoyaltyCalculation;
import com.example.repositories.RoyaltyCalculationRepository;

@Service
public class RoyaltyCalculationServiceImpl implements RoyaltyCalculationService{
	
	@Autowired
	RoyaltyCalculationRepository repository;

	@Override
	public void addRoyality(RoyaltyCalculation obj) {
		repository.save(obj);
	}
	
	

}
