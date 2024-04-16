package com.sunbeam;

import java.util.Scanner;

public class Book {

	private String isbn;
	private double price;
	private String category;
	private String authorName;
	private int quantity;
	private int UniqueID;

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity, int UniqueID, String category) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.setCategory(category);
		this.authorName = authorName;
		this.quantity = quantity;
		this.UniqueID = UniqueID;
	}

	

	public Book(String isbn) {
		this.isbn=isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUniqueID() {
		return UniqueID;
	}

	public void setUniqueID(int uniqueID) {
		UniqueID = uniqueID;
	}

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter isbn:");
		isbn = scanner.next();
		System.out.print("Enter price:");
		price = scanner.nextDouble();
		System.out.print("Enter author name:");
		authorName = scanner.next();
		System.out.print("Enter quantity:");
		quantity = scanner.nextInt();
		System.out.print("ENter UniqueID");
		UniqueID = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ ", UniqueID="+UniqueID +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Book) {
			Book b1 = (Book) obj;
			if (this.isbn.equals(b1.isbn)) {
				return true;
			}
		}
		return false;
	}

	public String getCategory() {
		
		return category;
	}

	public Object getUniqueId() {
		
		return UniqueID;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}