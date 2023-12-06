package BTVN;

import java.util.Scanner;
import java.lang.Math;

public class HomeWord {
	public static void main(String[] args) {
		String noiDung = "Bài Tập Về Nhà 2 - > 6";
		String hieuDepTry = "Thái Đức Hiếu";
		System.out.println("" + noiDung);
		System.out.println("" + hieuDepTry);

		// BAI 2 :

		double NhapA, c;
		int n;
		System.out.println(" Nhap 1 so bat ki :");
		Scanner nhapA = new Scanner(System.in);
		NhapA = nhapA.nextDouble();
		System.out.println(" Nhap 1 so nguyen duong : ");
		Scanner nhapN = new Scanner(System.in);
		n = nhapN.nextInt();
		c = NhapA * Math.pow(8, n);
		System.out.println(" P(x) = " + c);

		// BAI 3 :

		int A, hangChuc, hangDonVi;
		float tongKiSo;
		System.out.println("Nhap 1 so tu 10 -> 99 : ");
		Scanner kiSo = new Scanner(System.in);
		A = kiSo.nextInt();
//		// hang chuc = a / 10
//		// hang don vi = a % 10
		hangChuc = A / 10;
		hangDonVi = A % 10;
		tongKiSo = hangChuc + hangDonVi;
		System.out.println("Tổng 2 ký số là : " + tongKiSo);

		// BAI 4 :
		int a = 5;
		int b;
		int Tong = 0; // Tổng = 0 là với giá trị ban đầu bằng 0
		float trungBinh;
		for (int i = 0; i < a; i++) { // for vòng lặp thay vì 5 cái sysout thì dùng for giải thích i bắt đầu từ 0 và i
										// bé hơn a là bé hơn 5 nên i sẽ chạy từ 1 đến 5
			System.out.println(" Nhập số thứ " + (i + 1) + " :");
			Scanner nhap5So = new Scanner(System.in);
			b = nhap5So.nextInt();
			Tong += b; // += là toán tử thay vì lấy 5 số cộng nhau thì lấy số trên cộng số dưới rồi lưu
						// lại rồi cộng tiếp

		}
		System.out.println("Tổng : " + Tong);
		trungBinh = (float) Tong / a; // ép kiểu float
		System.out.println("Trung Bình : " + trungBinh);

		// BAI 5 :

		int C;
		float F;
		System.out.println("Nhập vào độ C : ");
		Scanner bienDoi = new Scanner(System.in);
		C = bienDoi.nextInt();
		F = (float) (C * 1.8) + 32;
		System.out.println(" F = " + F + "độ");

		// BAI 6 :
		int U;
		float V;
		System.out.println("Nhập số USD : ");
		Scanner chuyenTien = new Scanner(System.in);
		U = chuyenTien.nextInt();
		V = (float) (U*23.500);
		System.out.println("Chuyển đổi : " + V + "VNĐ");
	}
}
