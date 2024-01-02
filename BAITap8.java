package train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class BAITap8 {
	public static void main(String[] args) {
		// BAI 1
		int n;
		int soLe = 0;
		int soChan = 0;

		List<Integer> taoMang = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n ");
		n = sc.nextInt();
		while (n < 0) {
			System.out.println("Vui lòng nhập lại");
			n = sc.nextInt();
		}
		System.out.println("/n Câu 1");
		taoMang.add(n);
		if (n >= 0) {
			System.out.println("Đây là số nguyên dương");
		} else {
			System.out.println("Đây là số nguyên âm");
		}

		// BAI 1.1
		System.out.println("\nCâu 1.1");
		if (n % 2 == 0) {
			soChan++;
			System.out.println(n + " Số chẵn");
		} else {
			soLe++;
			System.out.println(n + " Số lẻ");
		}

		// BAI 1.2
		System.out.println("\nCâu 1.2");
		boolean laSoNguyenTo = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				laSoNguyenTo = false;
				break;
			}
		}
		if (laSoNguyenTo) {
			System.out.println("Là số nguyên tố");
		} else {
			System.out.println("Không phải là số nguyên tố");
		}
		// BAI 2
		System.out.println("\nCâu 2");
		switch (n) {
		case 0:
			System.out.println(n + "- >không");
			break;
		case 1:
			System.out.println(n + "- >một");
			break;
		case 2:
			System.out.println(n + "- >hai");
			break;
		case 3:
			System.out.println(n + "- >ba");
			break;
		case 4:
			System.out.println(n + "- >bốn");
			break;
		case 5:
			System.out.println(n + "- >năm");
			break;
		case 6:
			System.out.println(n + "- >sáu");
			break;
		case 7:
			System.out.println(n + "- >bảy");
			break;
		case 8:
			System.out.println(n + "- >tám");
			break;
		case 9:
			System.out.println(n + "- >chín");
			break;
		case 10:
			System.out.println(n + "- >mười");
			break;
		default:
			break;
		}

		// BAI 3
		tinhTong(taoMang);

		// BAI 4
		trungBinh(taoMang);
		// BAI 5
		lonBe(n);
		// Bai 6
		System.out.println("\nCâu6");
		System.out.println("Nhập chiều rộng");
		int nhap = sc.nextInt();
		while (nhap <= 0) {
			System.out.println("Vui lòng nhập lại");
			nhap = sc.nextInt();
		}
		dienTich(nhap);
		chuVi(nhap);

		// Bai 7
		System.out.println("\nCâu 7");
		hienThi(n);
		// Bai 8
		System.out.println("\nCâu 8");
		cacSoNguyenChan(n);

	}

	// Ham bai 3
	public static void tinhTong(List<Integer> taoMang) {
		System.out.println("\nCâu 3");
		double tong = 0;
		for (int number : taoMang) {
			for (int i = 0; i <= number; i += 2) {
				tong += i;
			}
		}
		System.out.println("Tổng các số chẵn là " + tong);
	}

	// Ham bai 4
	public static void trungBinh(List<Integer> taoMang) {
		System.out.println("\nCâu 4");
		double sum = 0;
		double giaTri = 0;
		Scanner sc = new Scanner(System.in);
		double trungBinh = 0;
		for (int number : taoMang) {
			for (int i = 0; i < number; i++) {
				System.out.println("Nhập giá trị thứ " + (i + 1));
				int n = sc.nextInt();
				sum += n;
				giaTri++;
			}
			trungBinh = sum / giaTri;
		}
		System.out.println("Trung Bình " + trungBinh);
	}

	// Ham bai 5
	public static void lonBe(int n) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nCâu 5");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int c;
		List<Integer> taoMang = new ArrayList<Integer>();
		for (int o = 0; o < n; o++) {
			System.out.println("Vui lòng nhập giá trị thứ " + (o + 1));
			c = sc.nextInt();
			taoMang.add(c);
		}
		for (int number : taoMang) {
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		System.out.println("Số nhỏ nhất là " + min);
		System.out.println("Số lớn nhất là " + max);
	}

	// Ham bai 6
	public static void dienTich(int nhap) {
		double dienTich = 0;
		dienTich = nhap * nhap;
		System.out.println("Diện tích hình vuông là " + dienTich);

	}

	public static void chuVi(int nhap) {
		double chuVi = 0;
		chuVi = nhap * 4;
		System.out.println("Chu vi hình vuông là " + chuVi);
	}

	// Ham bai 7
	public static void hienThi(int n) {
		List<Integer> taoMang = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1));
			int nhapN = sc.nextInt();
			while (nhapN < 0) {
				System.out.println("Vui lòng nhập lại!");
				nhapN = sc.nextInt();
			}
			taoMang.add(nhapN);
		}
		for (int number : taoMang) {
			System.out.println("Xuất phần tử " + number);
		}
	}

	// Ham bai 8
	public static void cacSoNguyenChan(int n) {
		List<Integer> taoMang = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1));
			int nhapN = sc.nextInt();
			while (nhapN < 0) {
				System.out.println("Vui lòng nhập lại!");
				nhapN = sc.nextInt();
			}
			taoMang.add(nhapN);

		}
		for (int number : taoMang) {
			if(number % 2 ==0 ) {
				System.out.println("Xuất phần tử " + number);
			}
		}
	}
}
