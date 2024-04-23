/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpl.util;

import java.util.Scanner;

/**
 *
 * @author NGOC ANH
 */
//đây là class, khuôn, chứa, có các đặc điểm. hành động.chứa các món đồ chơi dùng chung
//cho mọi nơi - vì nó k nhớ cái gì cho riêng tư của nó
//LIBRARY - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau
public class MyToys {

    //đặc điểm/hành vi là static, cho người ta sờ thì thêm public
    //k nhớ cái gì của riêng mình
    //một class bt thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    //Math: hầu hết static
    //String: vừa non vừa static
    //System: hầu hết static
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;

    //final ~ const bên C, biến k cho thay đổi value, trừ lần đầu tiên khai báo
    //hằng số
    //tên hằng số phải là chữ hoa
    
    //Đẩy scanner ra ngoài dùng chung cho các hàm
    private static Scanner sc = new Scanner(System.in);
    //private cho nhu cầu dùng nội bộ bên trong
    
    
    //vì trong quá trình làm app, việc nhập số là lặp lại nhiều lần
    //nhập 2 cạnh của 1 hcn, 3 cạnh của 1 tam giác, nhập sự lựa chọn menu 1..5, điểm tb, điểm thi các môn
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try catch - do while
    //tách việc nhập số nguyên thành 1 hàm, gói: chửi bới, trôi lệnh, nhập lại vào 1 chỗ
    //ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqrt(4) -> mình dùng, math k cần nhớ, k cần non-static
    //new mà trả về kết quả cho người ta dùng, k cần nhớ, dùng nhiều ram làm gì, STATIC là thượng sách
    public static int getAnInteger() {
        int n; //hứng từ bàn phím gõ gì
        //Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Input an integer: ");
                //n = sc.nextLine();
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên từ 1..6
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know input an integer");
            }
        } while (true);

    }

    //DI: Dependence Injection 
    //Double.partDouble
    //                              tbao nhập, lỗi, giới hạn đầu, giới hạn cuối ( ví dụ cho nhập từ 1-7)
    public static int getAnInteger(String inputMsg) {
        int n; //hứng từ bàn phím gõ gì
        do {
            try {
                System.out.println(inputMsg);
                //n = sc.nextLine();
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên từ 1..6
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know input an integer");
            }
        } while (true);

    }

}
