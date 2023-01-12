package com.boutique.Management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BillingRecord")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillingRecord {

	@Id
	private int id;
	private String Cust_name;
	private String Cust_mno;
	private int Quantity;
	private float Total_Amt;
	private int Pro_id;

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getCust_name() { return Cust_name; }
	 * 
	 * public void setCust_name(String cust_name) { Cust_name = cust_name; }
	 * 
	 * public String getCust_mno() { return Cust_mno; }
	 * 
	 * public void setCust_mno(String cust_mno) { Cust_mno = cust_mno; }
	 * 
	 * public int getQuantity() { return Quantity; }
	 * 
	 * public void setQuantity(int quantity) { Quantity = quantity; }
	 * 
	 * public float getTotal_Amt() { return Total_Amt; }
	 * 
	 * public void setTotal_Amt(float total_Amt) { Total_Amt = total_Amt; }
	 * 
	 * public int getPro_id() { return Pro_id; }
	 * 
	 * public void setPro_id(int pro_id) { Pro_id = pro_id; }
	 * 
	 * @Override public String toString() { return "BillingRecord [id=" + id +
	 * ", Cust_name=" + Cust_name + ", Cust_mno=" + Cust_mno + ", Quantity=" +
	 * Quantity + ", Total_Amt=" + Total_Amt + ", Pro_id=" + Pro_id + "]"; }
	 * 
	 * public BillingRecord(int id, String cust_name, String cust_mno, int quantity,
	 * float total_Amt, int pro_id) { super(); this.id = id; Cust_name = cust_name;
	 * Cust_mno = cust_mno; Quantity = quantity; Total_Amt = total_Amt; Pro_id =
	 * pro_id; }
	 * 
	 * public BillingRecord() { super(); // TODO Auto-generated constructor stub }
	 */
}
