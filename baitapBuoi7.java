package BTVN;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class baitapBuoi7 {
    public static void main(String[] args) {

        int n;
        int b = -1;
        double c = 0;
        double tongSoDuong = 0;
        double tongSoThuc = 0;
        double tongSoLe = 0;
        int demSoDuong = 0;
        float soNhoNhat = Float.MAX_VALUE;
        float soDuongNhoNhat = Float.MAX_VALUE;
        double soChanCuoiCung = -1;
        double soChanDauTien = -1;
        double soNguyenTo = -1;
        double duongThucCuoiCung = -1;
        double soChanMin = -1;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        List<Double> taoMang = new ArrayList<Double>();
        System.out.println("Vui lòng nhập n:  ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Vui lòng nhập giá trị n (số thực) thứ " + (i + 1) + ": ");
            c = sc.nextDouble();
            taoMang.add(c);
        }

        while (b != 0) {
            System.out.println("");
            System.out.println("-------- MENU --------");
            System.out.println("1: Tổng các số dương");
            System.out.println("2: Tổng các số lẻ");
            System.out.println("3: Đếm có bao nhiêu số dương");
            System.out.println("4: Tìm số nhỏ nhất trong mảng");
            System.out.println("5: Tìm số dương nhỏ nhất trong mảng");
            System.out.println("6: Tìm số chẵn cuối cùng trong mảng ");
            System.out.println("7: Tìm số chẵn đầu tiên trong mảng ");
            System.out.println("8: Tìm số nguyên tố đầu tiên trong mảng ");
            System.out.println("9: Tìm số dương cuối cùng trong mảng số thực");
            System.out.println("10: Tìm giá trị chẵn nhỏ nhất trong mảng ");
            System.out.println("0: Để thoát chương trình");
            b = sc.nextInt();

            if (b < 0 || b > 10) {
                System.out.println("Vui lòng chọn số hợp lệ!");
                b = sc.nextInt();
            }
            tongSoDuong = 0;
            tongSoThuc = 0;
            tongSoLe = 0;
            demSoDuong = 0;
            soNhoNhat = Float.MAX_VALUE;
            soDuongNhoNhat = Float.MAX_VALUE;
            soChanCuoiCung = -1;
            soChanDauTien = -1;
            soNguyenTo = -1;
            duongThucCuoiCung = -1;
            soChanMin = -1;
            for (double number : taoMang) {
                if (number > 0) {
                    demSoDuong++;

                    // Tính tổng số dương và số thập phân
                    if (Math.floor(number) == number) {
                        tongSoDuong += number;
                    } else {
                        tongSoThuc += number;
                    }

                    // Tính tổng số lẻ
                    if (number % 2 != 0) {
                        tongSoLe += number;
                    }

                    // Tìm số nhỏ nhất
                    if (number < soNhoNhat) {
                        soNhoNhat = (float) number;
                    }

                    // Tìm số dương nhỏ nhất và là số nguyên
                    if (number > 0 && number < soDuongNhoNhat && Math.floor(number) == number) {
                        soDuongNhoNhat = (float) number;
                    }

                    // Tìm số chẵn cuối cùng
                    if (number % 2 == 0) {
                        soChanCuoiCung = number;
                    }

                    // Tìm số chẵn đầu tiên
                    if (number % 2 == 0 && soChanDauTien == -1) {
                        soChanDauTien = number;
                    }

                    // Tìm số nguyên tố đầu tiên
                    if (number > 1) {
                        boolean laNguyenTo = true;
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                laNguyenTo = false;
                                break;
                            }
                        }
                        if (laNguyenTo && soNguyenTo == -1) {
                            soNguyenTo = number;
                        }
                    }

                    // Tìm số dương cuối cùng trong mảng số thực
                    if (number > 0) {
                        duongThucCuoiCung = number;
                    }

                    // Tìm giá trị chẵn nhỏ nhất trong mảng
                    if (number % 2 == 0 && (soChanMin == -1 || number < soChanMin)) {
                        soChanMin = number;
                    }
                    
                }
            }

            switch (b) {
                case 1:
                    System.out.println("Tổng các số dương nguyên là " + tongSoDuong);
                    System.out.println("Tổng các số dương thực là " + tongSoThuc);
                    System.out.println("Tổng là " + (tongSoDuong + tongSoThuc));
                    break;
                case 2:
                    System.out.println("Tổng số lẻ là " + tongSoLe);
                    break;
                case 3:
                    System.out.println("Có " + demSoDuong + " số dương");
                    break;
                case 4:
                    System.out.println("Số nhỏ nhất là " + soNhoNhat);
                    break;
                case 5:
                    System.out.println("Số dương nhỏ nhất là " + soDuongNhoNhat);
                    break;
                case 6:
                    System.out.println("Số chẵn cuối cùng là " + soChanCuoiCung);
                    break;
                case 7:
                    System.out.println("Số chẵn đầu tiên là " + soChanDauTien);
                    break;
                case 8:
                    System.out.println("Số nguyên tố đầu tiên là " + soNguyenTo);
                    break;
                case 9:
                    System.out.println("Số dương cuối cùng trong mảng số thực là " + duongThucCuoiCung);
                    break;
                case 10:
                    System.out.println("Giá trị chẵn nhỏ nhất trong mảng là " + soChanMin);
                    break;
                case 0:
                	System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    break;
            }
        }
    }
}
