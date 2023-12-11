package trainning;

import java.lang.System;
import java.util.Scanner;
import java.lang.Math;
public class luyentap {
	public static void main(String[] args) {
		// câu 1
//		int m, n;
//		int max;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập vào số nguyên m ");
//		m = sc.nextInt();
//		System.out.println("Nhập vào số nguyên n ");
//		n = sc.nextInt();
//
//		max = m > n ? m : n;
//		System.out.println("Số nguyên lớn nhất " + max);
//		
		// câu 2 // câu 3
//		int a, b, c;
//		int max;
//		int min;
//		int chon;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập vào số nguyên T1 ");
//		a = sc.nextInt();
//		System.out.println("Nhập vào số nguyên T2 ");
//		b = sc.nextInt();
//		System.out.println("Nhập vào số nguyên T3 ");
//		c = sc.nextInt();
//
//		System.out.println("Chọn 1 tăng dần");
//		System.out.println("Chọn 2 giảm dần");
//		chon = sc.nextInt();
//
//		if (chon == 1) {
//			if (a > b) {
//				max = a;
//				a = b;
//				b = max;
//			}
//			if (b > c) {
//				max = b;
//				b = c;
//				c = max;
//
//			}
//			if (a > b) {
//				max = a;
//				a = b;
//				b = max;
//			}
//			System.out.println("3 số tăng dần là " + a + " " + b + " " + c);
//		}
//		if (chon == 2) {
//			if (a < b) {
//				min = b;
//				b = a;
//				a = min;
//			}
//			if (c > b) {
//				min = c;
//				c = b;
//				b = min;
//			}
//			if (a < b) {
//				min = b;
//				b = a;
//				a = min;
//			}
//			System.out.println("3 số giảm dần là " + a + " " + b + " " + c);
//
//		}

		// Câu 4/65
		double a , b ,c ;
		double A,B,C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thực thứ 1 ");
		a = sc.nextDouble();
		System.out.println("Nhập số thực thứ 2 ");
		b = sc.nextDouble();
		System.out.println("Nhập số thực thứ 3 ");
		c = sc.nextDouble();
		
		A = Math.abs(a);
		B = Math.abs(b);
		C = Math.abs(c);
		
		System.out.println("3 số người dùng nhập " + A + " " + B + " " + C);

	}
}
