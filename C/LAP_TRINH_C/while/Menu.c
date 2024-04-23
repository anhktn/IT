#include <stdio.h>
void main(){
	printf ("MENU 10/7/2022");
	printf ("\n1: 10 dong HELLO ");
	printf ("\n2: Tinh tong cac so tu 1 den 10 ");
	printf ("\n3: Tinh tong day phan so 1+ 1/2 +...+ 1/n");
	printf ("\n4: tinh ham luy thua x^n");
	
	int a,i;
	float n,x, tong, ketqua;
	printf ("\nNhap vao chuc nang can tinh : ");
	scanf ("%d",&a);
	
	switch (a) {
		case 1: 
			i=1;
			while (i<=10) {
			printf ("\n%d HELLO",i);
			i++;
			}
			break;
		case 2:
			i=1;
			while (i<=10) {
				tong +=i;
				i++;
			} printf ("\nTong day so tu 1 den 10 la : %.2f",tong);
			break;
		case 3:
			printf ("\nNhap vao gia tri cua n : ");
			scanf ("%f",&n);
			i=1;
			while (i<=n){
				tong += 1.0/i;
				i++;
			}printf ("\nTong day phan so la: %.2f",tong);
			break;
		case 4:
			printf ("\nNhap vao co so x : ");
			scanf ("%f",&x);
			printf ("\nNhap vao so mu n : ");
			scanf ("%f",&n);
			ketqua = pow(x,n);
			printf ("\nKet qua ham luy thua la : %.2f",ketqua);
			break;
		default:
			printf ("\nChuc nang ban chon khong co trong menu");
			break;
	}
}
