//WAP to accept number from the user and chek whether the number is palindrome or not using do-while loop

package java_practicals;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,r,n1,sum=0;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		n1=n;
		do {
			 r=n%10;
			 sum=sum*10+r;
			 n=n/10;	 
		}
		while(n>0);
		if(n1==sum)
		{
		    System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}

}
