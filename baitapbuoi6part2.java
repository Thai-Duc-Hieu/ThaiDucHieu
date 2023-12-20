package BTVN;

import java.lang.String;
import java.lang.Math;
import java.util.Scanner;

public class baitapbuoi6part2 {
	public static void main(String[] args) {
//		// Câu b
//		int sum = 0;
//		int a = 1;
//		while (sum <= 10000) {
//			sum += a;
//			a++;
//		}
//		System.out.println("Giá trị của 1 + 2 + 3 + ... + n > 10000 là " + (a - 1));
//	}
//}
		
		
// Câu c
//		int a;
//		int soLe = 0;
//		float tong = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Vui lòng nhập số > 0 ");
//		a = sc.nextInt();
//		while (a < 0) {
//			System.out.println("Vui lòng nhập lại");
//			a = sc.nextInt();
//		}
//		for (int i = 0; i < a; i++) {
//			if (i % 2 != 0) {
//				soLe++;
//				tong += i;
//				System.out.println("Số lẻ thứ: " + i);
//			}
//
//		}
//		System.out.println("Số lẻ: " + soLe);
//		System.out.println("Tổng các số le: " + tong);
//	}
//}

// câu d

//		int n;
//
//		double x, ketqua;
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Vui lòng nhập n! ");
//		n = scanner.nextInt();
//		while (n <= 0) {
//			System.out.println("Vui lòng nhập lại n! ");
//			n = scanner.nextInt();
//		}
//		System.out.println("Vui lòng nhập x! ");
//		x = scanner.nextDouble();
//		while (x <= 0) {
//			System.out.println("Vui lòng nhập lại x! ");
//			x = scanner.nextDouble();
//		}
//
//		ketqua = tinhTong(x, n);
//		System.out.println("Tổng S(n) là: " + ketqua);
//	}
//
//	private static double tinhTong(double x, int n) {
//		// TODO Auto-generated method stub
//		double tong = 0;
//
//		for (int i = 1; i <= n; i++) {
//			tong += Math.pow(x, i);
//		}
//		return tong;
//	}
//}
		
		
// câu e

//		int a, b, c;
//		float tong = 0;
//		float total = 0;
//		int soNamKC;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Vui lòng nhập số tiền quý khách muốn gửi : ");
//		a = sc.nextInt();
//
//		System.out.println(" \n Ni Hao");
//		System.out.println("Quý khách vui lòng chọn thời gian gửi : ");
//		System.out.println("1 tháng vui lòng nhấn 1 ");
//		System.out.println("3 tháng vui lòng nhấn 2 ");
//		System.out.println("6 tháng vui lòng nhấn 3 ");
//		System.out.println("1 năm vui lòng nhấn 4 ");
//		System.out.println("2 năm vui lòng nhấn 5 ");
//		System.out.println("Sự lựa chọn khác vui lòng nhấn phím 6 ");
//		b = sc.nextInt();
//		while (b <= 0 || b > 6) {
//			System.out.println("Vui lòng chọn số hợp lệ!");
//			b = sc.nextInt();
//		}
//		switch (b) {
//		case 1:
//			System.out.println("Lãi suất là 3% ");
//			tong = (float) (3.0 / 100.0 * a);
//			total = a + tong;
//			System.out.println("Số tiền quý khách nhận được là : " + total);
//			break;
//		case 2:
//			System.out.println("Lãi suất là 3% ");
//			tong = (float) (3.0 / 100.0 * a);
//			total = a + tong;
//			System.out.println("Số tiền quý khách nhận được là : " + total);
//			break;
//		case 3:
//			System.out.println("Lãi suất là 5% ");
//			tong = (float) (5.0 / 100.0 * a);
//			total = a + tong;
//			System.out.println("Số tiền quý khách nhận được là : " + total);
//			break;
//		case 4:
//			System.out.println("Lãi suất là 6% ");
//			tong = (float) (6.0 / 100.0 * a);
//			total = a + tong;
//			System.out.println("Số tiền quý khách nhận được là : " + total);
//			break;
//		case 5:
//			System.out.println("Lãi suất là 8% ");
//			tong = (float) (8.0 / 100.0 * a);
//			total = a + tong;
//			System.out.println("Số tiền quý khách nhận được là : " + total);
//			break;
//		case 6:
//
//			System.out.println("Vui lòng nhập số tiền quí khách mong muốn  ");
//			c = sc.nextInt();
//			while (c < a) {
//				System.out.println("Vui lòng nhập lại số tiền quí khách mong muốn  ");
//				c = sc.nextInt();
//			}
//			if (c > a) {
//				System.out.println("Lãi suất là 8% ");
//				soNamKC = (int) ((c - a) / (a * 8.0 / 100));
//				System.out
//						.println("Để đạt được số tiền mong muốn, quý khách cần gửi trong khoảng " + soNamKC + " năm.");
//			} else {
//				System.out.println("Số tiền mong muốn phải lớn hơn số tiền gửi ban đầu.");
//			}
//
//			break;
//		default:
//			break;
//		}
//	}
//}
	// búa kéo kim	
		int nguoiChoi = 0;
		int mayChoi = 0;
		int hoa = 0;
		int suLuaChonNguoiChoi;
		int suLuaChonMay;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chào mừng tới với trò chơi Oẳn Tù Xì");

		while (true) {
			System.out.println("Chọn phím 1 để ra Búa");
			System.out.println("Chọn phím 2 để ra Kéo");
			System.out.println("Chọn phím 3 để ra Kim");
			System.out.println("Chọn phím 0 để ra Thoát");
			while (true) {
				suLuaChonNguoiChoi = sc.nextInt();
				if (suLuaChonNguoiChoi >= 0 && suLuaChonNguoiChoi <= 3) {
					break;
				} else {
					System.out.println("Nhập không hợp lệ. Vui lòng nhập lại.");
				}
			}
			if (suLuaChonNguoiChoi == 0) {
				break;
			}
			String[] troChoi = { "Búa", "Kéo", "Kim" };


			suLuaChonMay = (int) (Math.random() * troChoi.length);
			String mayChon = troChoi[suLuaChonMay];

			System.out.println("Sự lựa chọn của người chơi " + troChoi[suLuaChonNguoiChoi - 1]);
			System.out.println("Sự lựa chọn của máy " + mayChon);

			String ketqua = nguoiThang(troChoi[suLuaChonNguoiChoi - 1], mayChon);
			System.out.println(ketqua);

			if (ketqua.equals("Người Chơi Thắng")) {
				nguoiChoi++;
			} else if (ketqua.equals("Máy Thắng")) {
				mayChoi++;
			} 
		}
		System.out.println(" Tổng kết");
		System.out.println("Người chơi thắng " + nguoiChoi + " lần");
		System.out.println("Máy thắng " + mayChoi + " lần");
		if (nguoiChoi > mayChoi) {
			System.out.println("Người chơi thắng cuộc với tỷ số " + nguoiChoi + " - " + mayChoi);
		} else if (mayChoi > nguoiChoi) {
			System.out.println("Máy thắng cuộc với tỷ số " + mayChoi + " - " + nguoiChoi);
		} else {
			System.out.println("Hòa với tỷ số " + mayChoi + " - " + nguoiChoi);
		}
	}

	private static String nguoiThang(String suLuaChonNguoiChoi, String mayChon) {
		if (suLuaChonNguoiChoi.equals(mayChon)) {
			return "Hòa";
		} else if ((suLuaChonNguoiChoi.equals("Búa") && mayChon.equals("Kim"))
				|| (suLuaChonNguoiChoi.equals("Kéo") && mayChon.equals("Búa"))
				|| (suLuaChonNguoiChoi.equals("Kim") && mayChon.equals("Kéo"))) {
			return "Người Chơi Thắng";
		} else {
			return "Máy Thắng";
		}

	}
}
