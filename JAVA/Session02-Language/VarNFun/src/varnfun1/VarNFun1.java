/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varnfun1;

import java.util.Scanner;

/**
 *
 * @author NGOC ANH
 */
public class VarNFun1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithVariable();
        //playWithInteger();
        //playWithDouble();
        //playWithCharacters();
        //playWithBooleans();
        //inRaListCacSo();
        //inRaListCacSo(500);//code cứng, cố định value
        //không linh hoạt mềm mại,
        //linh hoạt: bạn muốn in đến mấy? hỏi và nhập
//        int n = inRaSoNguyenDuong();
//        System.out.println("So cua ban la: " + n);
//        
//        inRaListCacSo(n);//truyền tham trị, pass by value
        //value từ n của hàm main() sẽ được đưua qua ngõ/ngả
        //phễu máy xay, n hàm main() đập ngang sang n của hàm

        //OOP pass by reference - truyền tham chiếu 
        // con trỏ, địa chỉ
    }

    public static int inRaSoNguyenDuong() {
        int n;
        //nhập từ bàn phím, xài kỹ thuật OOP, chấm và bung lụa, name.charAt()
        Scanner banPhimCuaTui = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen: ");
        n = banPhimCuaTui.nextInt();

        return n;  //inRaSoNguyenDuong() = n;
    }

    //tui muốn in n số tự nhiên tính từ 1 
    //hiện tượng 1 class bất kì chứa nhiều hàm trùng tên những khác phần tham số đầu vào
    //mà phải khác trên data type chứ trông khải trên trên tên biến
    //được gọi là OVERLOAD/OVERLOADING - quá tải hàm
    //qua tải là hiện tượng mà ta cố gắng chất nhiều thứ tương đương trên cùng một chỗ
    //còn một khái niệm khác là OVERRIDE sẽ học sau
    public static void inRaListCacSo(int n) {
        //chỉ có thằng ngáo thì mới Scanf(n) ở đây!! n đã có giá trị khi dùng hàm
        //hàm đã có giá trị đầu vào trong tên gọi hàm
        System.out.println("Cac so nguyen tu 1 den " + n + " la: ");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }

    public static void inRaListCacSo() {
        System.out.println("Cac so nguyen tu 1 den 100 là: ");
        System.out.println("1, 2, 3, 4, 5, ....");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void playWithBooleans() {
        //C: đúng 1, >0, sai 0; int
        //java: đúng true, sai false --> boolean 
        // kiểu dữ liệu này có nhiều nguồn tài liệu nói nó chiếm đúng 1 bit để lưu trữ giá trị on off
        //tuy nhiên cũng có những tài liệu nói rằng nó dùng tới 8 bit = 1 byte
        boolean tinhTrangQuanHe = false;

        if (tinhTrangQuanHe == true) {
            System.out.println("Danh don co dich moi vui");
        } else {
            System.out.println("Vuon hong co loi nhung chua ai vao");
        }
        //khi trong if else chỉ chứa 1 câu lệnh thì k cần ngoặc nhọn
    }

    public static void playWithCharacters() {
        //2 byte cho kiểu char nhee, lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);

        //tên em thì sao? C: mảng các ký tự, không primitive nữa rồi, phức tạp rồi
        //                  char name[] = "Ngoc Anh";
        String name = "Ngoc Anh"; //loại data type mới hoàn toàn
        //phức tạp do gom n thứ khác
        //object dât type, học sớm thoyyy
        System.out.println("My name is: " + name);

        System.out.println("Ky tu dau tien trong ten cua toi: " + name.charAt(0));
        System.out.println("Ten khi viet thuong het: " + name.toLowerCase());
    }

    //Java ưu tiên Double hơn Float
    public static void playWithDouble() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi:  %.2f\n", pi); //cấm tuyệt đối k dùng %lf vì %f bên Java đại diện cho cả Double và Float

        float vat = 0.1F;   //đã ghi chú trong Cheat Sheet
        System.out.println("vat: " + vat);
    }

    public static void playWithInteger() {
        int n = 29;//mọi con số, ký tự xuất hiện trong code đc gọi là 
        //literal value
        //số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);

        long m = 3_000_000_000L;//phân cách literal trong code để đọc
        System.out.println("n: " + m);

        int status = 0xFA; //lưu hệ 16
        System.out.println("status: " + status);

        int phone = 010; // số 0 đứng đầu là hệ 8 octal
        System.out.println("phone: " + phone);
    }

    //static chỉ chơi với static
    public static void playWithVariable() {
        //biến là một vùng ram được đặt tên chiếm 1 số byte nhất định tùy loại
        //dữ liệu/thông tin mà nó chứa bên trong - data type - hình thức data
        //số, chữ, ảnh, ...
        //biến là cách đặt tên cho một đại lượng, 1 giá trị đơn , phức

        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong ram để lưu trữ những thông tin on off trong ram
        System.out.println("age: " + age); //~ printf("age: %d\n", age);

        int yob = 2001; //year of birth 
        age = 2021 - yob;

        System.out.println("age again: " + age);

        System.out.println("age su dung dinh luat bac cau: " + (2021 - yob));

        System.out.printf("in ra tuoi su ung %% giong ben C: %d \n", (2021 - yob));
    }
}
