//WAP to accept number from the user and display the greater number using else_if statement

package java_practicals;

import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		//To check the number greatest between four numbers
		if(num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println(num1+" is greater than other numbers");
			
		}
		else if(num2>num1 && num2>num3 && num2>num4)
		{
			System.out.println(num2+" is greater than other numbers");
			
		}
		else if(num3>num1 && num3>num2 && num3>num4)
		{
			System.out.println(num3+" is greater than other numbers");
		}
		else
		{
			System.out.println(num4+" is greater than other numbers");
		}

	}

}
