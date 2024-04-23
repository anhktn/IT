package data;

public class Dog {
    private String ten;
    private int namSinh;
    private double canNang;

    public Dog(String ten, int namSinh, double canNang) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.canNang = canNang;
    }
    
    public void traLoi() {
        System.out.println("Go go go ... ten cua toi la: " + ten);
        System.out.println("Go go go ... nam sinh cua toi la: " + namSinh);
        System.out.printf("|%-10s|%4d|%4.1f|\n", ten, namSinh, canNang);
        
    }
    
    //một obj bất kì có nhiều tt mô tả, ví dụ: xem điện thoại di động trên tgdđ,
    //đập hộp có sách ghi thông số luôn. Nhìn một cuốn sách trên mạng, cầm tay: tác giả, ngày xb, mã sách
    //gặp chú CSGT, show ra các info mình có: CCCD, Driver license, cà-vẹt...
    //việc show info của 1 obj là tự nhiên, Fb profile
    //đó là một hành động nên có của mỗi obj, mô tả, đặc tả obj
    //hành động đó có thể do ta chủ động tự đưa ra hoặc tự generate theo template có sẵn
    //template có sẵn java giúp mình, mình k cần code

    //@Override 
    //hoàn toàn khác overload đó nha, dính đến kế thừa
    //cả 2 thằng đều có liên quan đến 1 khái niệm POLYMORPHISM - 50 sắc thái, đa nhân cách
    //public String toString() {
        //return "Dog{" + "ten=" + ten + ", namSinh=" + namSinh + ", canNang=" + canNang + '}';
        //được quyền độ lại, vì chỉ cần trả chuỗi chứa info 
        //y chang mình làm card visit
//        String templateMessage = String.format("|%-10s|%4d|%4.1f|\n", ten, namSinh, canNang);//trả: chuỗi thô khoogn xuống hàng
//        return templateMessage;
        //return String.format("|%-10s|%4d|%4.1f|\n", ten, namSinh, canNang);
               
    //}
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }
   
   //hàm gắn với việc xử lý thông tin của chính object. Ai giàu info gã đó nên xử lý 
    public int getTuoi(){
        return 2021 - namSinh;
    }
    //viết code kiểu này gọi là hard-code, fix value, năm sau phải sửa code thì mới đúng
    //chuẩn: lấy giờ của hệ thống Window - namSinh;
    
}
