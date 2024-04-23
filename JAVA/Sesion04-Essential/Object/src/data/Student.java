package data;




public class Student {
    private  String id;   //nằm ở một vùng nhớ riêng mà obj nào cũng được xài ké,
                                //chung cho các obj cùng class
    private String name;  //vùng nhớ xài chung cho các obj cùng nhóm/Class
                                //dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng 
    
    //CHỐT HẠ: KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ ĐẶC ĐIỂM/ HÀM MÀ CỦA RIÊNG OBJ
    //TUI CÓ MÃ SỐ, BẠN CÓ MÃ SỐ, BẠN KIA CŨNG CÓ MS NHƯNG ĐỀU LÀ CỦA RIÊNG MỖI ĐỨA
    //chung đặc điểm nhưng khác value, vậy phải có biến clone riêng - NON - STATIC
    
    private int yob;
    private double gpa; //grade point average: điểm trung bình

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    } 

//    public void setId(String id) {
//        this.id = id;
//    }//hiếm khi đổi mã số, giống như môn Database primary key

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }   //NON-STATIC chơi với NON - Dĩ nhiên cùng obj, và STATIC LUÔN, ĐỒ RIÊNG THÀNH CHUNG
    
   
    public int getAge() {
        return 2021 - yob;
    }
    
    public void sayHi(){
        System.out.println("Hi every one, my name is: " + this.name);
        //System.out.println("By the way, my yob is: " + yob);
        //STATIC chỉ chơi với STATIC vì cùng khu vực, không chơi với non
        //Có quá trời yob được vì clone biết lấy ai bỏ ai
        
    }
}
