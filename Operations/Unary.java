//WAP to accept number from the user and perform using unary operator

package java_practicals;

import java.util.Scanner;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		res = num++;
		System.out.println("Result:"+res);
        res = ++num;
        System.out.println("Result:"+res);
        res = num--;
        System.out.println("Result:"+res);
        res = --num;
        System.out.println("Result:"+res);
	}

}
