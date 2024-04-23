package samusai;

import java.util.Scanner;

public class Samusai {
    ///Bài 9.2

    public static void main(String[] args) {
        //inputProfile();
        inputProfileXinXo();
    }


    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc định JVM J sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho ta 1 cơ chế xử lí khi có cà chướn, chuyển quyền giết chóc cho mình
        //báo JVM biết đừng giết, tao tự xử, nhốt các lệnh cà chớn lại , SANDBOX ( hộp cát)
        try {
            //lệnh cà chớn nằm here
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            //ALT + SHILTF + F: format code
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ này, khi cà chớn xảy ra
            //JVM không giết app như truyền thống
            //chỗ này là chỗ xử kí hậu quả cà chớn        
            //không có cà chớn thì không vào đây       
            //e chính là lá thư/thông báo màu đỏ JVM gửi cho mình báo rằng cõ lỗi cà chớn nè
            //làm gì thì làm
            //Exeption e = new Exception ( nội dung lỗi màu đỏ đây nè...);
            //về lí: e.xem lỗi, xử lý tự mình
            //về toán hóa, mình chỉ tập trung xử lý lỗi, biết thừa éo gõ đúng số mình cần

            //xử lý ra sao?? nhiều cách: default value là một cách (không hay)
            //                           hay: bắt nhập lại
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

    public static void inputProfileXinXo() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //cuộc chiến vô cực với những đứa cà chớn
        while (true) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break; //nếu nhập đúng thì thoát vòng lặp để đi tiếp nếu k các câu lệnh ngoài vòng lặp sẽ k bao h được chạm tới
            } catch (Exception e) {
                System.out.println("Do ku know to input a positive number?");
            }

        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

}
