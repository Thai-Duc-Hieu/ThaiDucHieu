/*
 * THÁI ĐỨC HIẾU
 * PART 2 CÂU ĐIỀU KIỆN 
 */


package BTVNBUOI4PART2;
import java.util.Scanner;
import java.lang.Math;
public class PART2 {
	public static void main(String[] args) {
		String name ;
		float soLuong ; 
		float donGia ; 
		float thanhTien ; 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên mặt hàng ");
		name = sc.nextLine();
		System.out.println("Nhập số lượng ");
		soLuong = sc.nextFloat();
		System.out.println("Nhập đơn giá ");
		donGia = sc.nextFloat();
		sc.nextLine();
		
		if(soLuong < 50) {
			thanhTien = soLuong * donGia ;
		}else if(soLuong > 100) {
			thanhTien = soLuong * donGia - 0.12f*donGia ; 
		}else {
			thanhTien = soLuong * donGia - 0.8f*donGia ;
		}
		System.out.println("Thành tiền : " + thanhTien);
	}
}
