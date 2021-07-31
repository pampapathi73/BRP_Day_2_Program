package com.bridgelabz.BRP.Day2;

import java.util.*;


public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		int a=random.nextInt(6) + 1;
		
		int b=random.nextInt(6) + 1;
		
		System.out.println("Sum of two dice is ="+(a+b));;

	}

}
