const btn = document.querySelectorAll(".product-item button");
btn.forEach(function (button, index) {
    button.addEventListener('click', function (event) {
        var btnItem = event.target;
        var product = btnItem.parentElement;
        var productImg = product.querySelector('img').src;
        var productName = product.querySelector("h2").innerHTML;
        var productPrice = product.querySelector("span").innerHTML
        addCart(productImg, productName, productPrice);
    });
});

/*-----------Thêm sản phẩm vào giỏ hàng---------*/
function addCart(productImg, productName, productPrice) {
    //tạo thẻ tr
    var addtr = document.createElement("tr");
    var cartItem = document.querySelectorAll("tbody tr");
    for (var i = 0; i < cartItem.length; i++) {
        var productT = document.querySelectorAll(".title");
        if (productT[i].innerHTML == productName) {
            alert("Sản phẩm của bạn đã có trong giỏ hàng");
            return;
        }
    }
    var trcontent = '<tr><td style="display: flex; align-items: center;"><img src="' + productImg + '" width="80px"><span class="title">' + productName + '</span></td><td><span class="gia">' + productPrice + '</span>Đ</td><td><input class="soluong" onchange="carttotal(), tongChiPhi()" style="width: 50px; outline: none;" type="number" value="1" min="1"/></td><td style="cursor: pointer"><span class="cart-delete">Xóa</span></td></tr>';
    addtr.innerHTML = trcontent;
    var carttable = document.querySelector("tbody");
    carttable.append(addtr);
    alert("Đã thêm sản phẩm trong giỏ hàng")

    carttotal();
    deleteCart()
}

/*-----------tính tổng tiền---------*/
function carttotal() {
    var cartItem = document.querySelectorAll("tbody tr");

    var totalC = 0;
    // console.log(cartItem);
    for (var i = 0; i < cartItem.length; i++) {
        var inputValue = cartItem[i].querySelector('input').value;
        var productPrice = cartItem[i].querySelector('.gia').innerHTML;

        totalA = Number(inputValue) * Number(productPrice) * 1000;
        //totalB = totalA.toLocaleString('de-DE');
        totalC += totalA;
        //console.log(totalC);
        //totalD = totalC.toLocaleString('de-DE');
    }
    var totalprice = document.querySelector(".tongTien span");
    var total = document.querySelector(".tongTien span");
    total.value = totalC;
    totalprice.innerHTML = totalC.toLocaleString('de-DE');

}


//-----------------Delete cart---------------

function deleteCart() {
    var cartItem = document.querySelectorAll("tbody tr");
    for (var i = 0; i < cartItem.length; i++) {
        var productT = document.querySelectorAll(".cart-delete");
        // console.log(productT);
        productT[i].addEventListener("click", function (event) {
            var cartDelete = event.target;
            var cartitemR = cartDelete.parentElement.parentElement;
            cartitemR.remove();
            carttotal();
        })
    }
}
//-----------------Sự kiện click vào icon cart---------------
var gioHang_ic = document.getElementsByClassName("cart-ic")[0];
gioHang_ic.addEventListener("click", function () {
    var gioHang = document.getElementsByClassName("cart")[0];
    gioHang.classList.toggle("hien");

    var sp = document.getElementsByClassName("product")[0];
    sp.classList.toggle("an");

    var slider = document.getElementsByClassName("main")[0];
    slider.classList.toggle("an");

    var tieuDe = document.getElementsByTagName("h2")[0];
    tieuDe.classList.toggle("an");

    var vid = document.getElementsByClassName("video-grid")[0];
    vid.classList.toggle("video-grid");
    vid.classList.toggle("an");

    document.getElementsByClassName('form-datHang')[0].style.display = "none";
});

gioHang_ic.addEventListener("mouseover", function(){
    
    var gioHang = document.getElementsByClassName("cart")[0];
    gioHang.classList.toggle("hien");
    gioHang.classList.toggle("mini");
    document.getElementsByClassName('form-datHang')[0].style.display = "none";
});

//----------Sự kiện click vào btn Đặt hàng trong cart---------
var btnDatHang = document.getElementById("datHang");

btnDatHang.addEventListener("click", function () {
    var cartItem = document.querySelectorAll("tbody tr");
    if (cartItem.length == 0) {
        alert("Giỏ hàng trống!");
    } else {
        document.getElementsByClassName('form-datHang')[0].style.display = "block";
    }
})

//validate
var hoTen = document.getElementById("hoTen");
var sdt = document.getElementById("sdt");
var email = document.getElementById("email");
var tenSP = document.getElementById("sanPham");
var noiNhanHang = document.getElementsByName("nnh");
var phiVanChuyen = document.getElementById("phiVanChuyen");
var phiVanChuyen = document.getElementById("phiVanChuyen");
function tongChiPhi() {
    var totalprice = document.querySelector(".tongTien span").innerHTML;
    var total = document.querySelector(".tongTien span");
    var tongChiPhi = document.querySelector(".tongThanhToan span");
    var t = Number(total.value) + Number(phiVanChuyen.value);
    tongChiPhi.innerHTML = t.toLocaleString("de-DE");
}


function diaDiem() {
    if (noiNhanHang[0].checked) {
        phiVanChuyen.value = 0;
    } else {
        phiVanChuyen.value = 30000;
    }
}

function validate() {
    var conloiTen = true;
    var conloiSDT = true;
    var conloiEmail = true;
    var conloiNoiNhanHang = true;

    var mesgTen = document.getElementById("errten");
    var mesgSDT = document.getElementById("errsdt");
    var mesgEmail = document.getElementById("erremail");
    var mesgNoiNhanHang = document.getElementById("errnoinhan");

    if (hoTen.value == "") {
        mesgTen.innerHTML = "Không bỏ trống tên";
    } else {
        conloiTen = false;
        mesgTen.innerHTML = "";
    }

    var regex = /^0[0-9]{9}$/;
    if (sdt.value == "") {
        mesgSDT.innerHTML = "Không bỏ trống SĐT";
    } else if (regex.test(sdt.value) == false) {
        mesgSDT.innerHTML = "Số điện thoại gồm 10 ký tự số và bắt đầu là 0 ";
    } else {
        conloiSDT = false;
        mesgSDT.innerHTML = "";
    }

    if (email.value == "") {
        mesgEmail.innerHTML = "Không bỏ trống Email";
    } else if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
        mesgEmail.innerHTML = "Email phải gồm cả @ và .";
    } else {
        conloiEmail = false;
        mesgEmail.innerHTML = "";
    }

    var noiNhanHang = document.getElementsByName("nnh");
    for (var i = 0; i < noiNhanHang.length; i++) {
        if (noiNhanHang[i].checked) {
            conloiNoiNhanHang = false;
            mesgNoiNhanHang.innerHTML = "";
        }
    }
    if (conloiNoiNhanHang) {
        mesgNoiNhanHang.innerHTML = "Bạn phải chọn nơi nhận hàng"
    }

    if (conloiTen || conloiSDT || conloiEmail || conloiNoiNhanHang) {
        return false;
    }
    return true;
}

//
var datMua = document.getElementById("datMua");
datMua.addEventListener("click", function () {
    if (validate()) {
        alert("Bạn đã đặt hàng thành công");
    }
});

const menus = document.querySelectorAll(".mn");
const dropdown = document.querySelectorAll(".dropdown");

//thêm các sự kiện onlick vào các title
menus.forEach((el) => {
    el.addEventListener("mouseover", (e) => {
        remove();
        el.nextElementSibling.classList.toggle("active");
    })

})

function remove() {
    dropdown.forEach((ele) => {
        ele.classList.remove("active");
    })
}

