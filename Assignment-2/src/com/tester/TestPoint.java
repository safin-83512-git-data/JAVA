package com.tester;

import com.app.geometry.Point2D;

public class TestPoint {
		
		
	

			public static void main(String[] args) {
				Point2D p1 = new Point2D();
				p1.accept();
				
				Point2D p2 = new Point2D();
				p2.accept();
				
		
				if(p1.isEqual(p1, p2))
				{
					System.out.println("Points are equal");
				}else {
					System.out.println("Points are not equal");
				}
				
				p1.calculateDistance(p1, p2);
				
				

			}


		// TODO Auto-generated method stub

	}


