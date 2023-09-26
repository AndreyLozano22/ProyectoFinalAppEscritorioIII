package com.edu.co.bill.dao;

import java.util.List;

import com.edu.ue.model.Bill;

public interface BillDaoI {

	List<Bill> getBill();
	Bill createBill(Bill bill);
	void deleteBill(int bullId);
	
}
