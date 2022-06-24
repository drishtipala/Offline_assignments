//WAP to accept number from the user and perform using ternary operator

package java_practicals;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter a number:");
		num = sc.nextInt();
	    res = (num%2==0)?num*num:num*num*num;
        System.out.println("Result:"+res);
	}
}
