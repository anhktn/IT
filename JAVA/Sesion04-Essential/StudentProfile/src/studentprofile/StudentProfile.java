/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprofile;

import java.util.Scanner;

public class StudentProfile {
    //BÀi 9.1

    public static void main(String[] args) {
        inputProfile();
    }
    
    //nhập thông tin cơ bản của sinh viên và in ra
    public static void inputProfile() {
        //ko OOP, chỉ cần hiểu về việc nhập thông tin, không chơi class Student
        
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
//        yob = sc.nextInt();   //convert data từ bàn phím - là chuỗi thành số
//        // để lại rác trong buffer, tức là nó cần int thì chỉ lấy đúng đến int, còn rác nó bỏ lại , tệ nhất là enter, rác dấu cách + enter
//        //xóa bộ đệm trước khi nhập chuỗi, mẹo như sau
//        
//        //Cách 1:
//        sc.nextLine();
//        //vì nextLine() hốt tất cả rác, mình hốt xong mình k gán vào đâu cả
//        
//        //Cách 2:
//        String tmpNum = sc.nextLine(); 
//        yob = Integer.parseInt(tmpNum);

        yob = Integer.parseInt(sc.nextLine());
        //nextLine() hốt sạch buffer , loại bỏ enter, còn chuối số --> chuyển thành số
        
       
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        
          
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
      

    }
    
}
