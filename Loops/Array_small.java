package practicals;

import java.util.Scanner;

public class Array_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size,i,temp=0;
		System.out.println("Enter the size:");
		size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("Enter the numbers:");
		for(i=0;i<size;i++)
		{
			num[i] = sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
		   System.out.println(num[i]);
		}
		temp = num[0];
		for(i=0;i<size;i++)
		{
			if(temp>num[i])
			{
				temp = num[i];
			}
		}
		System.out.println("The smallest number is: " +temp);
	}
}
