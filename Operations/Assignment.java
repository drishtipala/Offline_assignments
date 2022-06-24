//WAP to accept number from the user and perform using assignment operater 

package java_practicals;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter a number:");
		num1 = sc.nextInt();
		num2=num1;
		System.out.println("Number is:"+num2);
		num2+=num1;
		System.out.println("Number is:"+num2);
		num2-=num1;
		System.out.println("Number is:"+num2);
		num2*=num1;
		System.out.println("Number is:"+num2);
		num2/=num1;
		System.out.println("Number is:"+num2);
		num2%=num1;
		System.out.println("Number is:"+num2);

	}

}
