package com.bridgelabz.BRP.Day2;

import java.util.Scanner;
public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:\n");
		double a=sc.nextDouble();
		System.out.println("Enter value of b:\n");
		double b=sc.nextDouble();
		System.out.println("Enter value of c:\n");
		double c=sc.nextDouble();
		
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);

	}

}
