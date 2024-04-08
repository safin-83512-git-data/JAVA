package com.tester;
import java.util.Scanner;

import com.app.fruits.apple2;
import com.app.fruits.fruits;
import com.app.fruits.mango2;
import com.app.fruits.orange2;


public class FruitBasket {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entet a busket size");
		int a = sc.nextInt();
		fruits arr[] = new fruits[a];
		int index = 0;
		fruits p;
		
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("6. Display tastes of all fruit");
			System.out.println("7. Mark a fruit as fresh");
			System.out.println("8.Mark all sour fruits stale ");
		
			System.out.print("Enter choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you...");
				break;
			case 1:
				if(index < a) {
                     

					System.out.println("enter Fruits name");
					String nm = sc.nextLine();
					sc.nextLine();
					System.out.println("enter Fruits weight ");
					double w = sc.nextDouble();
					System.out.println("enter Fruits color");
					String color = sc.nextLine();
				
					arr[index++] = new mango2(nm, color, w, true );
						
				} else {
					System.out.println("No Vacancies...");
				}
				break;
			case 2:
				if(index < a) {
					System.out.println("enter Orange name");
					String nm = sc.nextLine();
					sc.nextLine();
					System.out.println("enter Orange eight ");
					double w = sc.nextDouble();
					System.out.println("enter Orange color");
					String color = sc.nextLine();
				
					arr[index++] = new orange2(nm,w,color, true);
				
				} else {
					System.out.println("No more fruit available.");
				}
		
				break;
			case 3:
				if(index < a) {
					System.out.println("enter Apple name");
					String nm = sc.nextLine();
					sc.nextLine();
					System.out.println("enter Apple eight ");
					double w = sc.nextDouble();
					System.out.println("enter Apple color");
					String color = sc.nextLine();
				
					arr[index++] = new apple2(nm,w,color, true);
					
				} else
					System.out.println("No more fruit available.");
				break;

			case 4:
				for (int i = 0; i < index; i++) {
						
						System.out.println("taste of fruit "+arr[i].getName());
					}
				break;

			case 5:
				for (int i = 0; i < index; i++) {
					arr[i].getName();
					arr[i].getW();
					arr[i].getColor();
					System.out.println("Name of fruit "+arr[i].getName()+", weight of fruit "+arr[i].getW()+"color of fruits "+arr[i].getColor()+"taste of fruit "+arr[i].getIsFresh());
				}
				// to-do
				break;
			case 6:
				for (int i = 0; i < index; i++) {
					System.out.println("taste of fruit "+arr[i].getIsFresh());
				}
				// to-do
				break;
			case 7:

				System.out.println("enter fruits fresh index no ");
				int f = sc.nextInt();
					if(f < index)
//					boolean flag = sc.nextBoolean();
					arr[f].setIsFresh(false);
//				}
				// to-do
				break;
			case 8:
				for (int i = 0; i < index; i++) {
					if(arr[i] instanceof mango2) {
						mango2 m = (mango2)arr[i];
						System.out.println("taste "+m.taste());
					}
					if(arr[i] instanceof orange2) {
						orange2 o = (orange2)arr[i];
						System.out.println("taste "+o.taste());
					}
					if(arr[i] instanceof apple2) {
						apple2 k = (apple2)arr[i];
						System.out.println("taste "+k.taste());
					}
				}
				// to-do
				break;
				
			default:
				System.out.println("Wrong Choice..");
				break;
			}
		} while (choice != 0);
	}


}