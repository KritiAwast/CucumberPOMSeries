package com.pages;

public class Test {
	
	
//	public static void isPallin(int num) {
//		int sum = 0,r=0;
//		int temp;
//		
//		temp=num;
//		
//		while(num!=0) {
//			
//			r=num%10;
//			sum=(sum*10)+r;
//			num=num/10;
//			
//			
//					
//		}
//		
//		if(temp==sum) {
//			System.out.println("Pallindrom");
//		}
//		else {
//			System.out.println("Not a Pallindrom");
//
//		}
//	}
	
	public static void isAmstrong(int num1) {
		int r=0;
		int cube=0;
		int temp1;
		
		temp1=num1;
		
		while(num1!=0);{
			r=num1%10;
			num1=num1/10;
			cube= cube+(r*r*r);
			
		}
		if(temp1==cube) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not a armstrong");

		}
		
	}

	public static void main(String[] args) {
		
//		isPallin(122);
		isAmstrong(371);
		// TODO Auto-generated method stub

	}

}
