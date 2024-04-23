package dogmanagementv21;

import data.Dog;
public class DogManagementV21 {
    public static void main(String[] args) {
     
        Dog chiHu = new Dog("CHI HU HU", 2021, 2.1);
        chiHu.traLoi();
        
        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);
        ngaoDa.traLoi();
        
        System.out.println("Can nag cua Chi Hu sau khi sua:");
        chiHu.setCanNang(7.5);
        chiHu.traLoi();
        
        int chNamSinh = chiHu.getNamSinh();
        System.out.println("Nam sinh cua chiHu: " + chNamSinh);
          
        System.out.println("Nam sinh cua ngaoDa: " + ngaoDa.getNamSinh());
        
        //tui muốn show toàn bộ infor của tui, theo cách toString()
        //object có nhiều hành động
        System.out.println("Show all thong tin bang cach sd toString(): ");
        String chiHuDetail = chiHu.toString();
        System.out.println("CH detail: " + chiHuDetail); 
        System.out.println("ND detail: " + ngaoDa.toString());
     
        //hàm toString() rất đặc biệt, @Override
        //mục tiêu là show ra all của info đã đổ vào, hoặc chỉnh sửa
        //y chang như mở Setting trong phone xem phần info điện thoại
        
        System.out.println("Su dung toString() nhung k goi .toString()-GOI THAM TEN EM");
        System.out.println(chiHu);//chiHU là biến obj, lưu tọa độ cùng new
                                    //lý thuyết in ra địa chỉ, thực tế Java gọi toString() 
        System.out.println(ngaoDa); //gọi thầm tên em toString()
        
        //NẾU KHUÔN KHÔNG CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI
        //(GỌI THẦM HAY GỌI TRỰC TIẾP) THÌ JAVA SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJ THÀNH CON SỐ HEXA 
        //ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
        //HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256...
        
        
        //xem tuổi của một obj, tương tác hỏi đáp giao tiếp với obj qua dấu chấm
        System.out.println("Tuoi cua Ngao Da la: " + ngaoDa.getTuoi());
        
//        int a = 100;
//        printf("a: %d\n", a); --> 100, vùng ram có value mấy
//        printf ("a address: %u \n", &a); // vùng ram ở đâu vậy, tọa độ, địa chỉ của mày
//        int * p = &a; //p  lưu tọa độ của a, gọi là con trỏ vì tao nhắm tọa độ nhà mày
//        printf ("p có value của %u\n", p); --> địa chỉ của a, 6M
//        printf ("a có value of %d\n", *p); -> 100        
                 
    }
    
}
