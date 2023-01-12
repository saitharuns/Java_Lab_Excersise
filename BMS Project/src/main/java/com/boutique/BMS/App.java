package com.boutique.BMS;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.boutique.Management.BillingRecord;
import com.boutique.Management.Product;

public class App {
	public static void main(String[] args) {
		login();

	}

	public static void login() {
		System.out.println("Welcome to Boutique Management System.");
		System.out.println("Enter your UserName:");
		Scanner sc = new Scanner(System.in);
		String User = sc.nextLine();
		System.out.println("Enter your Password:");
		String Pass = sc.nextLine();
		if (User.equals("admin") && Pass.equals("admin")) {
			System.out.println("Login Sucessfully");
			mainpage();
		} else {
			System.out.println("Login failed!Try Again.");
		}
	}

	public static void mainpage() {
		System.out.println("Enter your choice:");
		System.out.println("1.Products");
		System.out.println("2.Billing");
		System.out.println("3.Exit");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1: {
			products();
			break;
		}
		case 2: {
			BillingRecord();
			break;
		}
		case 3: {
			System.out.println("Thank You For Visiting!");
			break;
		}

		default:
			System.out.println("Invalid Choice:");
			break;

		}
	}

	public static void products() {
		System.out.println("Enter your choice:");
		System.out.println("1.Add Product");
		System.out.println("2.Update Product");
		System.out.println("3.Remove Product");
		System.out.println("4.Search Products");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1: {
			add_pro();
			break;
		}
		case 2: {
			upd_pro();
			break;
		}
		case 3: {
			Delete_pro();
			break;
		}
		case 4: {
			search_pro();
			break;
		}
		default:
			System.out.println("Invalid Choice!");
			break;

		}
		mainpage();

	}

	public static void add_pro() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Product p1 = new Product();
		Transaction tr = s.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product_id");
		p1.setPro_id(sc.nextInt());
		System.out.println("Enter the Product_Category");
		p1.setPro_Cat(sc.next());
		System.out.println("Enter the Product_name");
		p1.setPro_name(sc.next());
		System.out.println("Enter the Product_Size");
		p1.setPro_size(sc.next());
		System.out.println("Enter the Product_Amt");
		p1.setPro_Amt(sc.nextFloat());
		System.out.println("");
		s.save(p1);
		tr.commit();

		System.out.println("Product Added SuccessFully.");
		mainpage();

	}

	public static void upd_pro() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("choose product using id to change amount:");
		int pro_id = sc.nextInt();
		Product p1 = s.get(Product.class, pro_id);
		if (p1 == null) {
			System.out.println("Product is not Found!");
			mainpage();
		} else {
			System.out.println(p1);
		}
		System.out.println("Enter the Choice:");
		System.out.println("1.Change Amount");
		System.out.println("2.Change Size");
		System.out.println("3.Change Name");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: {

			System.out.println("Enter the Amount:");
			float pro_Amt = sc.nextFloat();
			p1.setPro_Amt(pro_Amt);
			s.update(p1);
			tr.commit();
			System.out.println("Amount is changed for the id " + pro_id);
			break;

		}
		case 2: {

			System.out.println("Enter the Size:");
			String pro_size = sc.next();
			p1.setPro_size(pro_size);
			s.update(p1);
			tr.commit();
			System.out.println("Size is changed for the id " + pro_id);
			break;

		}
		case 3: {

			System.out.println("Enter the Name:");
			String pro_name = sc.next();
			p1.setPro_name(pro_name);
			s.update(p1);
			tr.commit();
			s.close();
			System.out.println("Name is changed for the id " + pro_id);
			break;
		}
		default: {
			System.out.println("Please select correct choice!");
		}
		}
		mainpage();
	}

	public static void Delete_pro() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Product p1 = new Product();
		Transaction tr = s.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product_id");
		int pro_id = sc.nextInt();
		Product p = s.get(Product.class, pro_id);
		if (p == null) {
			System.out.println("Product is not Found!!!!!!");
			mainpage();
		}
		s.delete(p);
		tr.commit();
		System.out.println("Product Deleted Successfully.");
		mainpage();
	}

	public static void search_pro() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction tr = s.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product_id");
		int id = sc.nextInt();
		Product p1 = s.get(Product.class, id);
		tr.commit();
		if (p1 == null) {
			System.out.println("Product is not Found!");

		} else {
			System.out.println(p1);
		}
		mainpage();
	}

	public static void BillingRecord() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		BillingRecord b1 = new BillingRecord();
		Transaction tr = s.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bill Id");
		int bill_id = sc.nextInt();
		BillingRecord p1 = s.get(BillingRecord.class, bill_id);
		if (p1 != null) {
			System.out.println("Bill Id already Exists");
			mainpage();
		}
		b1.setId(bill_id);
		System.out.println("Enter the Cust_name");
		b1.setCust_name(sc.next());
		System.out.println("Enter the Cust_mno");
		b1.setCust_mno(sc.next());
		System.out.println("Enter the Product Id");
		int id = sc.nextInt();
		Product p2 = s.get(Product.class, id);
		if (p2 == null) {
			System.out.println("Product is not Found!");
			mainpage();
		} else {
			System.out.println(p2);
		}
		b1.setPro_id(id);
		System.out.println("Enter the Quantity");
		int qty = sc.nextInt();
		b1.setQuantity(qty);
		Product p3 = s.get(Product.class, id);
		float cal = (p3.getPro_Amt() * qty);
		System.out.println("Total Bill Amount :" + cal);
		b1.setTotal_Amt(cal);
		s.save(b1);
		tr.commit();
		System.out.println("Billing generated successfully..");
		mainpage();

	}
}