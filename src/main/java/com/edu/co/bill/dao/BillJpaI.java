package com.edu.co.bill.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.model.Bill;

public interface BillJpaI extends JpaRepository<Bill, Integer>{

}
