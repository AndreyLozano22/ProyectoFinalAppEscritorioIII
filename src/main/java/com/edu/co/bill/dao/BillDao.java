package com.edu.co.bill.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.ue.model.Bill;

@Repository
public class BillDao implements BillDaoI {

	@Autowired
	BillJpaI myBill;
	
	@Override
	public List<Bill> getBill() {
		return myBill.findAll();
	}

	@Override
	public Bill createBill(Bill bill) {
		return  myBill.save(bill);
	}

	@Override
	public void deleteBill(int bullId) {
		myBill.deleteById(bullId);
	}
}
