package com.bridgelabz.BRP.Day2;

import java.math.*;
import java.util.Scanner;
public class Distance {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x coordinate:");
		double x1 = sc.nextDouble();
		System.out.println("Enter y coordinate");
		double y1 = sc.nextDouble();
		System.out.println("Distance from origin:");
		double d = Math.sqrt((x1*x1 + y1*y1));
		System.out.println(d);

	}

}
 