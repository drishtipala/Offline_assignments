/* WAP to accept number from the user and check whether the number is divisble by 7. 
 * If it is then display the square or otherwise cube of the given number.
 */

package java_practicals;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		//To check whether the number is divisble by 7 and print its square
		if(num%7==0)
		{
			System.out.println("Number is divisible by 7");
			res = num*num;
			System.out.println("Square of number is:"+res);
		}
		else
		{
			System.out.println("Number is not divisible by 7");
			res = num*num*num;
			System.out.println("Cube of number is:"+res);
		}
		

	}

}
