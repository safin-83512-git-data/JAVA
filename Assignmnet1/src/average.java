import java.util.Scanner;

public class average {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two values : ");
	if(sc.hasNextDouble())
	{
		double n1 = sc.nextDouble();
		if(sc.hasNextDouble())
		{
			double n2 = sc.nextDouble();
			{
				System.out.println("Average = "+(n1+n2)/2);
				
			}
		}
		else
		System.out.println("Second value is wrong! ");
		
	}
	else
		System.out.println("FIrst values is wrong! ");

	}

}
