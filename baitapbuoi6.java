package BTVN;

import java.util.Scanner;

public class baitapbuoi6 {
	/**
	 * @param args
  	* bài tập buổi 6 
	 */

	public static void main(String[] args) {
		// câu 1
		// a ) dùng for

//		int soChan = 0;
//		int soLe = 0;
//		for (int i = 0; i <= 100; i++) {
//			if(i%2==0) {
//				soChan ++;
//				System.out.println("Số thứ " + i + " là số chẵn");
//			}else {
//				soLe ++;
//				System.out.println("Số thứ " + i + " là số lẻ");
//			}
//		}
//		System.out.println("Có " + soChan + " số chẵn");
//		System.out.println("Có " + soLe + " số lẻ");

		// b ) dùng while
//		int soChan = 0;
//		int soLe = 0;
//		int i = 0;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				soChan++;
//				System.out.println("Số thứ " + i + " là số chẵn");
//			} else {
//				soLe++;
//				System.out.println("Số thứ " + i + " là số lẻ");
//			}
//			System.out.println("Có " + soChan + " số chẵn");
//			System.out.println("Có " + soLe + " số lẻ");
//			i++;
//		}

		// bài 2
		// while

//		int soChan = 0;
//		int a;
//		int i = 1;
//		float Tong = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập n ");
//		a = sc.nextInt();
//		while (i <= a) {
//			if (i % 2 == 0) {
//				Tong += i;
//				soChan++;
//				System.out.println("Số thứ " + i + " là số chẵn");
//			}
//			i++;
//		}
//		System.out.println("Có " + soChan + " số chẵn");
//		System.out.println("Tổng sổ chẵn " + Tong);

		// for

//		int soChan = 0 ;
//		int a;
//		float Tong = 0 ;
//		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Nhập n ");
//		a = sc.nextInt();
//		for ( int i = 1 ; i <= a ; i++ ) {
//			if ( i % 2 ==0) {
//				soChan ++;
//				Tong += i;
//				System.out.println("Số thứ " + i + " là số chẵn");			}
//		}
//		System.out.println("Có " + soChan + " số chẵn");
//		System.out.println("Tổng sổ chẵn " + Tong);

		// bài 3
		// while

		int soLe = 0;
		int i = 0 ;

		while (i <= 1000) {
			if (i % 3 == 0) {
				soLe++;
				System.out.println("Số thứ " + i + " là số chia hết cho 3");
			}
			i++;
		}
		System.out.println("Có " + soLe + " số chia hết cho 3");

		// for

//		int soLe = 0;
//		for (int i = 0; i <= 1000; i++) {
//			if (i % 3 == 0) {
//				soLe++;
//				System.out.println("Số thứ " + i + " là số chia hết cho 3");
//			}
//		}
//		System.out.println("Có " + soLe + " số chia hết cho 3");

	}
}
