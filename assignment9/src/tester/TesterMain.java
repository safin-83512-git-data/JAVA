package tester;

import java.util.Arrays;
import java.util.Comparator;

import com.sunbeam.student;

public class TesterMain {

	public static void main(String[] args) {

		class studentComparator implements Comparator<student>
		{

			@Override
			public int compare(student s1, student s2) {
				int diff=-s1.getCity().compareTo(s2.getCity());
					if(diff==0)
						diff=(int)(s2.getMarks()-s1.getMarks());
					if(diff==0)
						diff=s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		
		studentComparator studentComparator=new studentComparator();
		student[] studentArr=new student[10];
		studentArr[0]=new student(4,"safin","latur",25);
		studentArr[1]=new student(9,"rohit","satara",25);
		studentArr[2]=new student(10,"altaf","nanded",30);
		studentArr[3]=new student(1,"vedant","pune",50);
		studentArr[4]=new student(3,"sumama","punjab",20);
		studentArr[5]=new student(2,"guddu","Mirzapur",50);
		studentArr[6]=new student(5,"Jack","London",50);
		studentArr[7]=new student(7,"sairaj","Kolhapur",50);
		studentArr[8]=new student(6,"shoeb","nagpur",50);
		studentArr[9]=new student(8,"Zain","Mumbai",50);
		
		
		
		System.out.println("Before sorting:");
		for(student sElement:studentArr)
			System.out.println(sElement);
		
		Arrays.sort(studentArr,studentComparator);
		System.out.println("After sorting:");
		for(student sElement:studentArr)
			System.out.println(sElement);
		
	}

}