package practicals;

import java.util.Scanner;

public class Hybrid_1 {
	Scanner sc = new Scanner(System.in);
	int[] num;
	int size,i,temp=0,r,sum=0;
	double avg;
	public void accept()
	{
		System.out.println("Enter size of the array:");
		size = sc.nextInt();
		num = new int[size]; 
		System.out.println("Enter " +size+ " numbers:");
		for(i=0;i<size;i++)
		{
			num[i] = sc.nextInt();
		}
	}
}
