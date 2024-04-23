/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws11;

/**
 *
 * @author NGOC ANH
 */
public class WS11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean ketqua = kiemTraSoNguyenTo(100);
        System.out.println("100: " + ketqua);
        System.out.println("250: " + kiemTraSoNguyenTo(200));
        
        inDSCacSoNguyenTo();
    }
    
    //in các số nguyên tố từ 1 đến 100
    public static void inDSCacSoNguyenTo() {
        System.out.println("Day cac so nguyen to tu 1 den 100: ");
        for (int i = 1; i <= 100; i++)
            if (kiemTraSoNguyenTo(i))  //if điều gì đúng thì làm tiếp trong if
                System.out.print(i + " ");
    }
    
    public static boolean kiemTraSoNguyenTo(int n){
        if (n < 2)
            return false;
        //else rồi đấy nếu CPU đến đây, tức là n > 2
        //kiểm tra xem trong khoảng từ n + 1 ... căn (n)
        //lỡ tay chia hết đứa nào không, có kl ngay k nguyên tố
        if (n == 2)
            return true;
        
        //for 2..căn n, n ơi, m có chia hết đứa nào từ 2..căn (n)
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                return false; //n mày lỡ tay chia hết trong (2... căn(n))
         
        //hết for rồi mà k thoát sớm, đích thị không chia hết đứa nào
        //sure nguyên tố
        return true;
       
    }
    
}
