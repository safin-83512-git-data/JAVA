package com.invoice.hardwarestore;

import java.util.Scanner;

public class InvoiceTest 
{

	public static void main(String[] args)
	{
			
			Scanner val = new Scanner(System.in);
			System.out.println("Enter Product Partnumber: ");
			String b = val.nextLine();
			
			System.out.println("Enter Product Decription: ");
			String c = val.nextLine();
			System.out.println("Product Purchased Quantity: ");
			int d = val.nextInt();
			System.out.println("Product Price: ");
			Double e = val.nextDouble();
			
			Invoice s = new Invoice(b,c, d,e);
			s.display();

		

		// TODO Auto-generated method stub

	}

}
