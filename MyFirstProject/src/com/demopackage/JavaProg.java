package com.demopackage;

import java.util.Scanner;

public class JavaProg {

	public static void main(String[] args) {
		
		/*int flag=0;
		System.out.println("1 \n 2");
		for(int i=3;i<=100;i++){
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println(i+" \n");
			flag=0;
		}*/
		
		/*Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		reader.close();
		int sum=0;
		
		while(n>0){
			sum= sum + n%10;
			n=n/10;
		}
		
		System.out.println("sum ="+ sum);*/
		
		
		
		/*Scanner input= new Scanner(System.in);
		System.out.println("Enter a String to reverse :");
		String reverse= input.next();
		input.close();*/
		String reverse="I Love, India";
		String[] array= reverse.split(" ");
		String[] revString= new String[10];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("length=" + array.length);
		for(int i=0;i<array.length;i++){
			revString[i]= array[array.length-(i+1)];
			System.out.println(revString[i]);		
		}
		
		
		
		
		
	}

}
