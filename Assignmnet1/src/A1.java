import java.util.Scanner;
public class A1 {
	
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numberr: ");
	int numberr = sc.nextInt();
	
	System.out.println("Given number: "+numberr);
	System.out.println("Binary equivalent: "+Integer.toBinaryString(numberr));
	System.out.println("Octal equivalent : "+Integer.toOctalString(numberr));
	System.out.println("Hexadecimal equivalent: "+Integer.toHexString(numberr));
}
}
