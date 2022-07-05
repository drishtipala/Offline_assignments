package practicals;

import java.util.Scanner;

public class Overriding_result extends Overriding2{
	public static void main(String[] args)
	{
		accept();
	}
    public static void accept()
    { 
    	Scanner sc = new Scanner(System.in);
    	int n1;
    	System.out.println("The Process of Palindrome");
    	System.out.println("Enter a number:");
    	n1 = sc.nextInt();
    	Overriding1 obj = new Overriding1();
    	obj.poly(n1);
    	System.out.println("The Process of Sum of Digit");
    	System.out.println("Enter a number:");
    	n1 = sc.nextInt();
    	Overriding2 obj1 = new Overriding2();
    	obj1.poly(n1);
    }	
}