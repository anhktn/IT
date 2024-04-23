package studentmanagement1;

import data.Student;
import java.util.Scanner;

public class StudentManagement1 {

    public static void main(String[] args) {
        //saveAStudent();
        //inputAStudent();
          saveAStudents();
    }
    
    //nhập từ bàn phím
    //cần Scanner obj bàn phím. OOP cái gì cũng obj, class
    //Máy Cam, Scanner tiệm phôt, WC, Bàn Phím Cơ -> nhóm quét dữ liệu đưa vào máy tính
    //class Scanner xuất hiện. Muốn xài thì phải new để nó hành xử
    //từ bàn phím đi vào RAM, do đó phải có biến để hứng value
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Input id: " );
        id = sc.nextLine();
        
        System.out.print("Input name: " ); //chuỗi trước số k bị lạc trôi lệnh
        name = sc.nextLine();
        
        System.out.print("Input yob: " );
        yob = sc.nextInt();
        
        System.out.print("Input gpa: " );
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        //x.setId(id); //nguy hiểm
    }
    
    //hard code
    public static void saveAStudents() {
        Student cuong = new Student("PH12345", "CUONG VO", 1996, 6.6);
        Student an = new Student("PH36088", "AN NGUYEN", 2001, 8.9);
        Student binh = new Student("PH40777", "BINH LE", 2004, 0.4);
        an.showProfile();
        binh.showProfile();
        
        //chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("An name (truc tiep-directly): " + an.name);
        System.out.println("An name (truc tiep-directly): " + an.getName());
        
        //vì sờ được trực tiếp cái name/biến/instant variable, ta có thể get() và set()
        an.name = "KHONG HOC BAI";
        Student.name = "CAY RANK K CAY CODE";

        System.out.println("Binh name (truc tiep-directly): " + binh.name);
        System.out.println("Nam name again (directly)" + an.name);
        System.out.println("Student name (truc tiep-directly): " + Student.name);
        
        
        an.showProfile();
        
        //sayHi() mà sayHi() đang là STATIC
        System.out.println("Using static");
        an.sayHi();//đồ static không tự ý nữa, không theo kiểu của riêng mình cho static
        binh.sayHi();
        Student.sayHi();// tên Class chấm static vì là đổ chung cho multiple object (mulltiple : nhiều)
        
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức là chạm sờ STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                  đồ của riêng từng obj
           
    }
    
    
    //STATIC ăn theo thằng cuối cùng
}

