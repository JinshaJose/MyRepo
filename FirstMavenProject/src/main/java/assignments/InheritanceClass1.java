package assignments;

import java.util.Scanner;

public class InheritanceClass1 {
	int basicPay;
	int deduction;
	int bonus;
	public void get() 
	{
	
	Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Basic Pay: ");
    basicPay = scanner.nextInt();

    System.out.print("Enter Deduction: ");
    deduction = scanner.nextInt();

    System.out.print("Enter Bonus: ");
    bonus = scanner.nextInt();
    
    System.out.println("Salary Slip");
    System.out.println("Basic Pay = "+basicPay);
	System.out.println("Deduction = "+deduction);
	System.out.println("Bonus = "+bonus);

}
}