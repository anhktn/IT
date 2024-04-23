/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author NGOC ANH
 */
//khuôn dùng để đúc ra các object, các đối tượng mà ta cần lưu trữ info,
//thứ làm ra để bán
//khuôn phải kín, có phếu để chế, rót hứng đổ data, nguyên liệu
public class Dog {
    //chứa đặc điểm chi tiết mà cái khuôn, object tương lai sẽ có
    //khuôn design ra sao, mai mốt objetc có thế
    private String ten;
    private int namSinh;
    private double canNang;
    //...
    
    //có khuôn thì phải có phễu/miêng loe để hứng vật liệu đi vào
    //phễu dừng để đúc ra, tạo ra, construct cái object
    public Dog(String iTen, int iNamSinh, double  iCanNang){
        ten = iTen;
        namSinh = iNamSinh;
        canNang = iCanNang;
    }
    //phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    //tạo ra object vì thông qua nó như cái phễu vật liệu chả vào trong khuân
    //vật liệu khô ra object/bức tượng, cmnd của ai, hồ sơ đc tạo ra
    //CONSTRUCTOR, PHỄU LÀ HÀM CỰC KÌ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT 
    //CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA DỮ LIỆU VÀO, TỨC LÀ CÓ MỘT OBJECT MỚI 
    //PHỄU LÀ HÀM CỰC KỲ ĐẶC BIỆT KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG VOID LUÔN, 
    //TAO ÓI VỀ NGUYÊN MỘT BỨC TƯỢNG ĐANG ĐÚC
    //tên 100% giống tên class
    
    //viết các hàm xử lý data, ví dụ như giao tiếp hỏi năm sinh
    //mày tỏi tao trả lời, vì ba má đã fill năm sinh = 2001;
    //object thì gọi là hành động, behavior, xử lý tính toán trên các biến đã đc
    //đổ value từ lúc đúc ra
    
    //hàm có thể gọi n lần tương đương các hành động mà obj nào đó lặp đi lặp lại 
    //hành động của object gọi n lần trên object đó
    public void traLoi() {
        System.out.println("Go go go ... ten cua toi la: " + ten);
        System.out.println("Go go go ... nam sinh cua toi la: " + namSinh);
        System.out.printf("|%-10s|%4d|%4.1f|\n", ten, namSinh, canNang);
        
    }
    
    //đi xăm mình, nhuộm tóc
    //thay đổi info lúc ba má new/đúc ra mình
    public void setNewCanNang(double newCanNang) {
        canNang = newCanNang;
    }
    
    //vì mặc định info sexlaf giấu, khi ình gieo tiếp mình ới bật nó ra
    //chia sẻ info khi được hỏi, đó chính là method hàm hành động get()
    public int getNamSinh(){
        return namSinh;
    }
    
}
//code bên ngoài giống khuôn bị thủng
//ngoài đời: bạn (sinh năm 2001), tui ( năm sinh 2001

//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJ, THỰC THỂ (SỐNG)
//Tính đóng gói dữ liệu (data encapsulation) là một khái niệm quan trọng 
//trong lập trình hướng đối tượng, bao gồm cả Java. Nó cho phép bạn ẩn thông tin
//chi tiết về cách dữ liệu được lưu trữ và xử lý bên trong một đối tượng
//và chỉ tiết lộ những giao diện công khai (public interfaces) để tương tác với
//dữ liệu đó. Trong Java, tính đóng gói dữ liệu thường được thực hiện bằng cách
//sử dụng các lớp và phạm vi truy cập (access modifiers) như private, protected 
//và public.
