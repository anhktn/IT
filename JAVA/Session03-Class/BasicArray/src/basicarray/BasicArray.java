package basicarray;

public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        playWithPrimitiveArrayV2();
//        playWithStudentObject();
          playWithObjectArray();
    }
//-----------------------BÀI 12----------------------
    public static void playWithPrimitiveArray() {
        //double vol[365]; //Java cấm khai báo kích thước mảng, số phần tử trong ngoặc vuông
        float v[] = {0, 0, 5, 0, 15, 20, 25}; //mảng có 7 phần tử, có sẵn lun value
        //7 biến float v[0] = 0; v[1] = 0; v[2] = 5,...
        //7 biến float này trên HEAP đấy, có new ngầm đấy, có malloc() đấy
        System.out.println("The array há values of (printed by individual)");
        v[0] = 6868;
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);

        for (int i = 0; i < 7; i++) {
            System.out.println(v[i] + " ");
        }

        //ta có thể xem mảng như là 1 tập hợp các value trong dấu {} giống toán
        //ta có thể xài khái niệm với mọi, với mỗi để duyệt qua toàn bộ mảng
        System.out.println("\nThe aray v has values of (using for each)");
        for (float x : v) {
            // x = v[0], x = v[1], x = v[2], x = v[i] với mọi x là biến lẻ, = từng
            //thằng lẻ trong mảng sỉ
            //sout(v[i]) ~~~~~~~~~~~~~~ sout(x)
            System.out.println(x + " ");
        }

        //kỹ thuật quét qua mảng
        //dùng đèn quét từ đầu đến cuối
        //kỹ thuật dùng là 1 con số 
        //duyệt qua tất cả các phần tử của tập hợp
    }

    public static void playWithPrimitiveArrayV2() {
//        float* arr = calloc(7, sizeof(float));
//         biến con trỏ      new Object()
        double arr[] = new double[365]; //default gán hết = 0
        //new() là phễu để đuc object!!!!!!!!!!!!!!
        // em mún có 365 biến double, nó là biến lẻ nè nè
        // arr[0], arr[1], arr[i]...
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;

        System.out.println("The array há values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        //arr[0] éo sổ gì vì nó là biến primitive
        //arr.lenght
        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG MẸ GÌ CHUƯA BIẾT
        //TÊN MẢNG LÀ BIẾM MÁ MÌ, TÚ ÔNG TÚ BÀ, BIẾN OBJECT, BIẾN CON TRỎ, REFERENCE
        //TAO SẼ TRỎ VÙNG RAM CHÀ BÁ LỬA NEW ĐÓ, KO ĐÚC TRUYỀN THỐNG MÀ LÀ
        //                                          ĐÚC NHIỀU BIẾN
        //MÁ MÌ SẼ QUẢN LÝ BAO NHIÊU CHÁU DƯỚI QUYỀN,
        //MÁ MÌ CHẤM RA ĐC SỐ LÍNH
        //arr.
    }

    //BÀI 13
    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20};//new ngầm, không nói rõ việc new, thực ra có
        int arr3[] = new int[]{5, 10, 15, 20};

        int arr2[] = new int[5];

        int arr[]; //t thông báo rằng sẽ có nhiều biến
        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu cầu!!!
        arr[0] = 5; //int a = 5;
        arr[1] = 10; //int b = 10;
        arr[2] = 15; //int c = 15;

        //arr là gì, mày là một biến đặc biệt, mày là biến object luôn, vì trỏ 1 vùng
        //có quyền chấm, chấm cài gì???, tệ nhất là .toString()
        //arr là biến phức tạp vì nó có nhiều info bên trong, info này là
        //phần tử của mảng
        //arr[0] ~~~~~ arr.get(thằng thứ 0) -> được 5 / arr[0] = 5
        //arr.length - biến lưu đặc điểm của 1 mảng, có bao nhiêu phần tử
        // -> static hay non? non vì nếu static mọi mảng cùng kích thước
        //arr.length; //hằng số đặc biệt, ăn theo từng mnarg, mỗi mảng sẽ khác nhau size
        System.out.println("Array has: " + arr);
        //gọi thầm tên em, convert data của
        //các biến thành mã hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        //arr. xổ ra gì? public của vùng new
        //arr[0]. xổ ra gì? xổ ra cái đầu mày, teo là primitive, tên biến phức tạp
        //nhưng tao vẫn đơn giá trị (tê tao có ngoặc vuông do trùng tên
        //nhưng ta là tên cho value đươn giản
        for (int x : arr) {
            System.out.print(x + " ");
        }
        //get() set() khoogn có mà thay = chơi trực tiếp với các value trong biến

    }

    public static void playWithStudentObject() {
        Student x; //tớ là một sinh viên nghen
        x = new Student("SE123456", "AN NGUYEN", 2004, 5.6);
        x.showProfile();
    }

    public static void playWithStudentArray() {
        //luuw hồ sơ sinh viên cả lớp
        //10 bạn sinh viene
        //10 biến, 10 tên tắt + 10 nhát new() ~ 10 value phức tạp
        //lưu 10 số tự nhiên
        //10 biến/tên tắt + 10 value đơn
        int arr[] = new int[10]; //arr[0] ~ int x ; arr[1] ~ int y
        //= value đơn từ từ

        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
//        s1 = ngoặc tròn
//      x[0], x[1]
        Student list[] = new Student[10]; //đừng nhầm lẫn khi new, 2 loại ngoặc
        //() gọi phễu 1 object
        //[] tao cần ? biến đối tượng
        //[] dành cho nhiều biến, nhiều tên gọi tắt   
        list[0] = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        list[1] = new Student("SE123457", "BINH LE", 2000, 5.7);
        list[2] = new Student("SE123458", "CUONG VO", 1999, 5.8);

        // mấy con trỏ còn lại mang giá trị gì ??? biến Student chưa gán mang giá trị gì
        //giá trị gì
        //list[3] -> list[9]???? 0 là DEFAULT 
        //                      trỏ vào tọa độ 0 của RAM, địa chỉ 0 của RAM
        //                      byte đầu tiên trong thanh RAM toàn là số OFFOFFOFFOFFOFF
        //tức là byte đầu tiên (thứ 0) tọa độ thứ 0 của ram chứa toàn số 0
        //byte NULL BYTE k có gì cả, toàn 0
        //in cái mảng coi
        System.out.println("The list of students");
        for (int i = 0; i < list.length ; i++){
            list[i].showProfile();
        }
        
        s1 = null; //tao trỏ đáy ram heng, null heng, làm biếng new
                    //có value rồi, số 0, tọa độ  0 ở đáy ram, đi vào 00000
                    s1.showProfile(); //có mẹ gì mà show, NullPointerException
                    
       //NGUYÊN TẮC KHI CHƠI VỚI MẢNG LÀ: BIẾN COUNT ĐỂ CHO BIẾT
       //MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KO FOR ĐẾN .LENGHT
       //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
    }
    
    public static void playWithObjectArray(){
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYEN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BINH LE", 2000, 5.0);

        System.out.println("The student list: ");
        for (Student x : arr) {
            //x chính là arr[0]; x = arr[1] //hai chàng x và arr[0] cùng trỏ new AN NGUYEN
                                            //hai chàng x và arr[1] cùng trỏ nàng BINH LE
            x.showProfile();
        }
        //sắp mảng tăng dần theo điểm tb
        //lí thuyết bạn[0] sẽ phải có điểm 5
        //             [1] sẽ phải có điểm 9
        
        
        
    }
    //1. TÊN MẢNG . LENGTH VÀ () MÁ MÌ VÙNG NEW MẢNG
    //2. Phần tử mảng[0-index] . được hay k tùy mảng
    //                          mảng-pri[0] k chấm được
    //                          mảng-obj[0] . nó ra từa lưa, nó là biến object
    //                          Student x   x. bình thường
    //                          mảng-obj[0].bình thường (tên biến có[])
    
    //3. STATIC     Student. -> xài chung cả họ sv nha
}

//byte đầu tiên trong ram gọi là byte thứ 0, trong đó là off off off hết, tối thui
//nếu một biến con trỏ đã lỡ trỏ vào vùng khác và bỗng nhiên k muốn lưu vùng đó nữa thì cho nó trỏ vào byte đầu tiên bằng cách = null
//null pointer tức là ở đáy ram, ngắt kết nối với vùng đang trỏ
//và vùng kia k có ai trỏ nữa, dọn rác --> system.gc --> dọn ngay vùng ram k có ai trỏ -->gabage collecter