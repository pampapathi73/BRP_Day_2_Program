package com.bridgelabz.BRP.Day2;

import java.util.Scanner;
public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:\n");
		int a=sc.nextInt();
		System.out.println("Enter value of b:\n");
		int b=sc.nextInt();
		System.out.println("Enter value of c:\n");
		int c=sc.nextInt();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);

	}

}
