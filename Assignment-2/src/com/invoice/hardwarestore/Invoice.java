package com.invoice.hardwarestore;

public class Invoice {
		private String Partnumber;
		private String description;
		private int purchased;
		private double price;
		public Invoice(String partnumber, String description, int purchased, double price) {
		
			Partnumber = partnumber;
			this.description = description;
			this.purchased = purchased;
			this.price = price;}
		public String getPartnumber() {
			return Partnumber;
			
				
		}
		public void setPartnumber(String partnumber) {
			Partnumber = partnumber;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getPurchased() {
			return purchased;
		}
		public void setPurchased(int purchased) {
			this.purchased = purchased;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			if(price<0) {
				this.price =0;
				
				}else {
			}
			
		}
		
		public void display() {
			setPrice(price);
		double d = getPrice() * getPurchased();	
		System.out.println("total amount = "+d);// TODO Auto-generated method stub

		}
		}





