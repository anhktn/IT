//câu lệnh alert tạo ra một hộp thoại thông báo với message là: Hi JavaSc ript Basic
alert('Hi JavaSc ript Basic')

//BIẾN VÀ CÁCH SỬ DỤNG
var fullName = 'Khuat Thi Ngoc Anh'; //có thẻ sử dụng dấu chấm phảy hoặc không để kết thúc câu lệnh
var age = 18;//khuyến khích nên sd dấu chấm phảy

//gọi hàm thông báo
alert(fullName);
alert(age);

//CÚ PHÁP COMMENT TRONG JS
/*

// 1. Mục đích sử dụng
//  -ghi chú
//  -vô hiệu hóa mã

// 2. Loại Comment
//  -comment 1 dòng
//  -comment nhiều dòng
//      +để comment một khối ta sd cú pháfa-pull-left
//          /*
//                khối lệnh ở đây sẽ đc comment
//           */

//       hoặc

//           /**
//           * 
//           */

// 3. Sử dụng phím tắt
//  -Window: Ctrl + /
//  -Mac OS: Command + /

//THUẬT NGỮ BUILT-IN LÀ GÌ?
/*
    Giới thiệu một số hàm built-in 
        1. alert
        2. console 
        3. confirm 
        4. prompt 
        5. set setTimeout
        6. set interval
*/
console.log('Đây là một dòng log') // hiển thị một dòng log trên của sổ console 
console.warn('Hiển thị dòng cảnh báo trên của sổ console');
console.error('Hiển thị dòng thông báo lỗi trên của số console')

confirm('Xác nhận bạn đủ tuổi!'); // hiển thị hộp thoại thông báo xác nhận gồm hai nút ok và cancel

prompt('Nhập số tuổi: ') // hiển thị hộp thoại cho phép người dùng nhập

setTimeout(function() {
    alert('Ngoc Anh');
}, 1000); //tham số thứ 1 truyền vào trong setTimeout là 1 function, tso thứ 2 là một khoảng thời gian
//tức là set timeout sẽ tự động gọi function sau một khoảng tgian nhất định(chỉ thực hiện câu lệnh 1 lần)

setInterval(function() {
    console.log('Day là log ' + Math.random);
}, 1000);
//tham số đầu tiên là một func, tham số thứ 2 là khoảng tgian
//sau một khoảng tgian nhất định thì setInterval sẽ thực hiện đi thực thiện lại việc gọi func( thực hiện nhiều lần)


//LÀM QUEN VỚI TOÁN TỬ
/*
 Giới thiệu toán tử trong JS
 1.Toán tử số học  - Arithmetic
    + - * / 

 2.Toán tử gán - Assignment
    =

 3.Toán tử so sánh - Comparison
    > < >= <= ==

 4.Toán tử logic - Logical
    && ||
 
 */

//TOÁN TỬ SỐ HỌC
/*
    + cộng
    - trừ
    * nhân 
    / chia
    ** lũy thừa
    % chia lấy dư
    ++ tăng một giá trị 
    -- giảm một giá trị 
*/

//TOÁN TỬ GÁN
