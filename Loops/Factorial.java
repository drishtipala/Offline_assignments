//WAP to accept number from the user and display its factorial using while loop

package java_practicals;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter a number");
		n = sc.nextInt();
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of number is: "+fact);
	}

}
