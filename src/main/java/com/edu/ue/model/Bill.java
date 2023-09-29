package com.edu.ue.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;


/**
 * The persistent class for the bill database table.
 * 
 */
@Entity
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bull_id")
	private int bullId;

	@Lob
	@Column(name="bill_customer_name")
	@Pattern(regexp="^[a-zA-Z]{4,}(?: [a-zA-Z]+){0,2}$", message="Ingrese un nombre de cliente valido")
	private String billCustomerName;

	@Lob
	@Column(name="bill_date")
	private String billDate;

	@Column(name="bill_total")
	private double billTotal;

	public Bill() {
	}

	public int getBullId() {
		return this.bullId;
	}

	public void setBullId(int bullId) {
		this.bullId = bullId;
	}

	public String getBillCustomerName() {
		return this.billCustomerName;
	}

	public void setBillCustomerName(String billCustomerName) {
		this.billCustomerName = billCustomerName;
	}

	public String getBillDate() {
		return this.billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public double getBillTotal() {
		return this.billTotal;
	}

	public void setBillTotal(double billTotal) {
		this.billTotal = billTotal;
	}

}