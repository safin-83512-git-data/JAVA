import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, quantity;
        double total = 0;

        
        System.out.println("Welcome to the SAFIN's Restaurant!");
        System.out.println("Menu Dishes:");
        System.out.println("1. Dosa (30 Rs.)");
        System.out.println("2. Samosa (15 Rs.)");
        System.out.println("3. Idli (20 Rs.)");
        System.out.println("4. Poha (25 Rs.)"); 
        System.out.println("5. VadaPAV (20 Rs.)"); 
        System.out.println("6. Maggie (35 Rs.)"); 
        System.out.println("7. Burger (60 Rs.)");  
        System.out.println("8. Special Chai (10 Rs.)"); 
        System.out.println("9. Generate Bill");

        do {
            System.out.print("Enter your choice (1-9): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity of Dosa: ");
                    quantity = sc.nextInt();
                    total += quantity * 30;
                    break;
                case 2:
                    System.out.print("Enter quantity of Samosa: ");
                    quantity = sc.nextInt();
                    total += quantity * 15;
                    break;
                case 3:
                    System.out.print("Enter quantity of Idli: ");
                    quantity = sc.nextInt();
                    total += quantity * 20;
                    break;
                case 4:
                    System.out.print("Enter quantity of Poha: ");
                    quantity = sc.nextInt();
                    total += quantity * 25;
                    break;
                case 5:
                    System.out.print("Enter quantity of VadaPAV: ");
                    quantity = sc.nextInt();
                    total += quantity * 20;
                    break;
                case 6:
                    System.out.print("Enter quantity of MAggie: ");
                    quantity = sc.nextInt();
                    total += quantity * 35;
                    break;
                case 7:
                    System.out.print("Enter quantity of Burger: ");
                    quantity = sc.nextInt();
                    total += quantity * 60;
                    break;
                
                    
                case 8:
                    System.out.print("Enter quantity of Chai: ");
                    quantity = sc.nextInt();
                    total += quantity * 10;
                    break;
                case 9:
                    System.out.println("Generating Bill...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 9);

        if (total > 0) {
            System.out.println("Your Total Bill is: Rs." +total);
        } else {
            System.out.println("YOu have not ordered yet!");
        }

       
    }
}
