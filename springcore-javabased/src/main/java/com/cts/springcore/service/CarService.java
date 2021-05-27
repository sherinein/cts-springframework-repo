package com.cts.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springcore.dao.CarDAO;

@Service
public class CarService {
	@Autowired
	private CarDAO carDao;
	
}
