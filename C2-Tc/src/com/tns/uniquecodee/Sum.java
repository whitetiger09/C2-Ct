package com.tns.uniquecodee;
import java.util.*;
public class Sum {
	public static void sumNum(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		return;
	}
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		sumNum(a,b);
		
	}
}
