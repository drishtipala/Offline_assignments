package practicals;

import java.util.Scanner;

public class Array_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size,i,j,temp=0;
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("Enter the numbers: ");
		for(i=0;i<size;i++)
		{
			num[i] = sc.nextInt();
		}	
		for(i=0;i<size;i++)
		{
		  for(j=i+1;j<size;j++)
		  {
				if(num[i]<num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				
			}
		}
		System.out.println("Ascending numbers are:");
		for(i=0;i<size;i++)
		{
			System.out.println(num[i]);
		}		
	}	
}
