//WAP to accept number from the user and display whether the number is an armstrong number or not

package java_practicals;

import java.util.Scanner;

public class Do_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,rem,sum=0,i;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		i=n;
		do
		{
			rem = n%10;
			sum = sum+rem*rem*rem;
			n = n/10; 
		}
		while(n>0);
		if(i==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("It is not an Armstrong");
		}
		
	}
}

