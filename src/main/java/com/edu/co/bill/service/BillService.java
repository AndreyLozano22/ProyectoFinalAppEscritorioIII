package com.edu.co.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.co.bill.dao.BillDaoI;
import com.edu.ue.model.Bill;

@Service
public class BillService implements BillServiceI{

	@Autowired
	BillDaoI dao;

	@Override
	public List<Bill> getAllBill() {
		return dao.getBill();
	}

	@Override
	public Bill newBill(Bill bill) {
		return dao.createBill(bill);
	}

	@Override
	public void dropBill(int bullId) {
		dao.deleteBill(bullId);
	}
	
	
}
