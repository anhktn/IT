
import data.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGOC ANH
 */
public class Stage {
    public static void main(String[] args) {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //biến tham chiếu       object, vùng ram bự trong HEAP
        //biến con trỏ          instance, hiện thân, bức tượng, thể hiện của object
        //biến object
    
        s1.showProfile();
        //s1 đang nắm/ lưu tọa độ vùng ram object trong heap
        //new làm cực kì nhiều việc
        //  1.clone khuôn (object và static)
        //  2.gọi phễu đổ dât vào vùng clone
        //  3.chốt lại tọa độ vùng new vừa rồi và đem tọa độ đó gán cho biến con trỏ
       
        
        //s1 là biến,vậy nó có thể thay đổi value
        //sếp với ạn trẻ đang trỏ đến CaSi SonTung
        //sếp với người đi làm, trỏ đến ông/bà quyết định lương cho mình
        //sếp tham chiếu người này người kia
        
        Student x1 = s1; //hai con trỏ cùng trỏ 1 vùng new, 2 chàng trỏ 1 nàng
        
        s1 = new Student("SE666788", "BINH LE", 1998, 8.8);
        s1.showProfile();
        
        System.out.println("AN sau khi s1 từ chối chơi");
        x1.showProfile();
        
        //AN NGUYỄN KO CÒN AI TRỎ, KHÔNG CÒN CÁCH NÀO LẤY LẠI ĐƯỢC VÙNG RAM NÀY
        //TỌA ĐỘ NEW CŨ TA KHÔNG GIỮ LẠI
        
        //biến object này là tay cầm con diều, new chính là con diều
        //khi tay cầm nối dây con diều mới, con diều cũ ko còn chơi nữa, đứt sợi dây, bay mất
        //một vùng ram new Object mà k còn ai trỏ tới, JVM có ctrinh ngầm gọi là
        //GARBAGE COLLECTOR,  ĐI GOM NHỮNG VÙNG NEW MỒ CÔI KO CON TRỎ, DỌN  FREE RAM
        //trả lại ram k xài cho new sau này
        
        //1 biến có quyền trỏ vùng new, giữ lại AN được không mà vẫn có BÌNH
        
        
        //VI DIỆU, SUY NGHĨ ĐIỀU GÌ DIỄN RA
        new Student("SE18889", "NGOC ANH", 2004, 8.8).showProfile();
           
    }
}
