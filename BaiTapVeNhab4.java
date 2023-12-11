
// NGAY 15/12/2023
// THAI DUC HIEU 

package BTVNb4;

import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class BaiTapVeNhab4 {
	public static void main(String[] args) {

		// BAI 1

//		String nhapTenA;
//		String nhapTenB;
//		String nhapTenC;
//		int namSinhTreNhat = 0;
//		String tenTreNhat;
//		int a, b, c;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập tên sv ");
//		nhapTenA = scanner.nextLine();
//		System.out.println("Nhập năm sinh ");
//		a = scanner.nextInt();
//		scanner.nextLine();
//
//		System.out.println("Nhập tên sv ");
//		nhapTenB = scanner.nextLine();
//		System.out.println("Nhập năm sinh ");
//		b = scanner.nextInt();
//		scanner.nextLine();
//
//		System.out.println("Nhập tên sv ");
//		nhapTenC = scanner.nextLine();
//		System.out.println("Nhập năm sinh ");
//		c = scanner.nextInt();
//		scanner.nextLine();
//
//		if (a > b && a > c) {
//			namSinhTreNhat = a;
//			tenTreNhat = nhapTenA;
//		} else if (b > c) {
//			namSinhTreNhat = b;
//			tenTreNhat = nhapTenB;
//		} else {
//			namSinhTreNhat = c;
//			tenTreNhat = nhapTenC;
//		}
//		System.out.println(" Nam Sinh Trẻ Nhất " + tenTreNhat + " Năm Sinh " + namSinhTreNhat);

//	

		// BAI 2

//		int soChan = 0, soLe = 0;
//		int a, b, c;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập số nguyên ");
//		a = sc.nextInt();
//		System.out.println("Nhập số nguyên ");
//		b = sc.nextInt();
//		System.out.println("Nhập số nguyên ");
//		c = sc.nextInt();
//
//		if (a % 2 == 0) {
//			soChan++;			
//		} else {
//			soLe++;
//		}
//		
//		if (b % 2 == 0) {
//			soChan++;			
//		} else {
//			soLe++;
//		}
//		
//		if (c % 2 == 0) {
//			soChan++;			
//		} else {
//			soLe++;
//		}
//		System.out.println("Số lượng số chẵn là " + soChan);
//		System.out.println("Số lượng số lẻ là " + soLe);

		//BAI 3 :
//		String tenA;
//		String tenB;
//		String tenC;
//		String ten;
//		int namSinh;
//		int a,b,c;
//		String gioiTinh;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập tên cán bộ ");
//		tenA = sc.nextLine();
//		System.out.println("Nhập năm sinh cán bộ ");
//		a = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Nhập giới tính cán bộ ( nam / nữ )");
//		String gioiTinh1=sc.nextLine();
//		
//
//		System.out.println("Nhập tên cán bộ ");
//		tenB = sc.nextLine();
//		System.out.println("Nhập năm sinh cán bộ ");
//		b = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Nhập giới tính cán bộ ( nam / nữ )");
//		String gioiTinh2=sc.nextLine();
//		
//
//		System.out.println("Nhập tên cán bộ ");
//		tenC = sc.nextLine();
//		System.out.println("Nhập năm sinh cán bộ ");
//		c = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Nhập giới tính cán bộ ( nam / nữ )");
//		String gioiTinh3=sc.nextLine();
//		
//		
//		
//		if (a > b && a > c) {
//		namSinh = a;
//		ten = tenA;
//		gioiTinh = gioiTinh1;
//	} else if (b > c) {
//		namSinh = b;
//		ten = tenB;
//		gioiTinh = gioiTinh2;
//	} else {
//		namSinh = c;
//		ten = tenC;
//		gioiTinh = gioiTinh3;
//	}
//		
//	System.out.println(" Cán Bộ : " + ten + "\n Năm Sinh : " + namSinh + "\n Giới Tính : " + gioiTinh);
	
//		//BAI4
//	double x,y;
//	double x1,y1;
//	double x2,y2;
//	double x3,y3;
//	String A;
//	String B;
//	String C;
//	String truongDH;
//	String ten;
//	double khoangcach1;
//	double khoangcach2;
//	double khoangcach3;
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Nhập trường đại học ");
//	truongDH = sc.nextLine();
//	System.out.println("Nhập tọa độ trường đại học ( x , y )");
//	x = sc.nextDouble();
//	y = sc.nextDouble();
//	
//	sc.nextLine();
//
//	System.out.println("Nhập tên sinh viên ");
//	A=sc.nextLine();
//	System.out.println("Nhập tọa độ sinh viên ( x , y )");
//	x1 = sc.nextDouble();
//	y1 = sc.nextDouble();
//	
//	sc.nextLine();
//
//	System.out.println("Nhập tên sinh viên ");
//	B = sc.nextLine();
//	System.out.println("Nhập tọa độ sinh viên ( x , y )");
//	x2 = sc.nextDouble();
//	y2 = sc.nextDouble();
//		
//	sc.nextLine();
//
//	System.out.println("Nhập tên sinh viên ");
//	C = sc.nextLine();
//	System.out.println("Nhập tọa độ sinh viên ( x , y )");
//	x3 = sc.nextDouble();
//	y3 = sc.nextDouble();
//		
//	khoangcach1 = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1, 2));
//	khoangcach2 = Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2, 2));
//	khoangcach3 = Math.sqrt(Math.pow(x-x3,2)+Math.pow(y-y3, 2));
//		
//	if(khoangcach1 > khoangcach2 && khoangcach1 > khoangcach3) {
//		ten = A;
//	}else if(khoangcach2 > khoangcach3)	{
//		ten = B;
//	}else {
//		ten = C;
//	}
//		
//	System.out.println(" Sinh viên xa nhât " + ten + ", Trường ĐH " + truongDH);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
