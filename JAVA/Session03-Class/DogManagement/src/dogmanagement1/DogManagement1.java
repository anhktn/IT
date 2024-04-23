/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogmanagement1;

import data.Dog;

/**
 *
 * @author NGOC ANH
 */
public class DogManagement1 {

    public static void main(String[] args) {
        // lấy khuôn Dog ra để đổ info 
        // y chang việc đi làm thẻ căn cước: lấy thông tin, in lên thẻ, đổ mực
        //sau khi chờ khô thì ta đc obj thuộc nhóm vừa đúc
        //đặt tên gọi tắt cho obj để dễ dàng nói chuyện tham chiếu đến
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 2.1);
//        biến/tên tắt      obj
        //có obj rồi thì obj sẽ biết làm gì đó
        chiHu.traLoi();
        
        Dog ngaoDa = new Dog("NGAO ĐA", 2020, 50.0);
        ngaoDa.traLoi();
        
        //chiHu sủa trở lại
        System.out.println("CHI HU HU sua tro lai:");
        chiHu.traLoi();
        
        // traLoi(); ??? đứa nào sủa vậy???, không biết, báo lỗi
        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJ, THÔNG QUA CHẤM
        
        System.out.println("Can nag cua Chi Hu sau khi sua:");
        chiHu.setNewCanNang(7.5);
        chiHu.traLoi();
        
        int chNamSinh = chiHu.getNamSinh();
        System.out.println("Nam sinh cua chiHu: " + chNamSinh);
          
        System.out.println("Nam sinh cua ngaoDa: " + ngaoDa.getNamSinh());
        
//        int yob = 2001;
//        System.out.println("yob: " + yob);//2021
//        yob = 2002;
//        System.out.println("yob gain: " + yob);//2002
    }
    
    //new là xin một vùng ram mới đủ chứa info của 1 bạn Dog sẽ được đúc
    //được đổ dữ liệu
    //tức là lúc này có tới 2 vùng ten dành cho 2 obj
    //ten ngaoDa k đè ten của chiHu
    
}
