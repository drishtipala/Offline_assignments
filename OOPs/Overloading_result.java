package practicals;

import java.util.Scanner;

public class Overloading_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accept();
		
	}
public static  void accept()
{
	int num1,num2,num3;
	Scanner sc = new Scanner(System.in);
	System.out.println("The Process of Reverse Number");
	System.out.println("Enter a Number");
	num1=sc.nextInt();
	Overloading obj=new Overloading();
	obj.poly(num1);
	System.out.println("The Process of Swapping of Number");
	System.out.println("Enter two  NUmber");
	num1=sc.nextInt();
	num2=sc.nextInt();
	obj.poly(num1, num2);
	System.out.println("The Process of Greater of three Number");
	System.out.println("Enter two  NUmber");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	obj.poly(num1, num2,num3);
}
}
