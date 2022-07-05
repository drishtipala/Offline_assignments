//WAP to implement sum and product using interface

package practicals;

import java.util.Scanner;

public class Inf_result implements Inf1,Inf2{
    Scanner sc = new Scanner(System.in);
    int num,sum=0,prod;
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		num = sc.nextInt();
		while(num>0)
		{
			int digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println("Sum Of Digit : " +sum);
	}
	@Override
	public void prod() {
		// TODO Auto-generated method stub
		prod = sum*sum;
		System.out.println("Product Of Digit: " +prod);
	}
	public static void main(String[] args)
	{
		Inf_result obj = new Inf_result();
		obj.sum();
		obj.prod();
	}
}
	

