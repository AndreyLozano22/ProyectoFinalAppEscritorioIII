package com.edu.co.bill.service;
import java.util.List;

import com.edu.ue.model.Bill;

public interface BillServiceI {
	List<Bill> getAllBill();
	Bill newBill(Bill bill);
	void dropBill(int bullId);
}
