package com.boutique.Management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private int pro_id;
	private String Pro_name;
	private String Pro_size;
	private float Pro_Amt;
	private String Pro_Cat;

	// in case lomobok is not working use all given below

	/*
	 * public int getPro_id() { return pro_id; }
	 * 
	 * public void setPro_id(int pro_id) { this.pro_id = pro_id; }
	 * 
	 * public String getPro_name() { return Pro_name; }
	 * 
	 * public void setPro_name(String pro_name) { Pro_name = pro_name; }
	 * 
	 * public String getPro_size() { return Pro_size; }
	 * 
	 * public void setPro_size(String pro_size) { Pro_size = pro_size; }
	 * 
	 * public float getPro_Amt() { return Pro_Amt; }
	 * 
	 * public void setPro_Amt(float pro_Amt) { Pro_Amt = pro_Amt; }
	 * 
	 * public String getPro_Cat() { return Pro_Cat; }
	 * 
	 * public void setPro_Cat(String pro_Cat) { Pro_Cat = pro_Cat; }
	 * 
	 * @Override public String toString() { return "Product [pro_id=" + pro_id +
	 * ", Pro_name=" + Pro_name + ", Pro_size=" + Pro_size + ", Pro_Amt=" + Pro_Amt
	 * + ", Pro_Cat=" + Pro_Cat + "]"; }
	 * 
	 * public Product(int pro_id, String pro_name, String pro_size, float pro_Amt,
	 * String pro_Cat) { super(); this.pro_id = pro_id; Pro_name = pro_name;
	 * Pro_size = pro_size; Pro_Amt = pro_Amt; Pro_Cat = pro_Cat; }
	 * 
	 * public Product() { super(); // TODO Auto-generated constructor stub }
	 */
}
