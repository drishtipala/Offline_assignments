//WAP to accept number from the user and check whether the number is divisble by 7, and diplay its square

package java_practicals;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		//To check whether the number is divisible by 7
		if(num%7==0)
		{
			System.out.println("Number is divisible by 7");
			res = num*num;
			System.out.println("Square of number is:"+res);
		}
		
	}

}
