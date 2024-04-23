#include <stdio.h>
void main () {
	//Nhap vao mot so va cho biet no co nho hon 20 hay khong
	int a;
	printf ("Nhap vao so a =");
	scanf ("%d",&a);
	
	if (a<20){
		printf ("\nso %d nho hon 20",a); 
		}
	else { printf ("\nso %d lon hon 20",a);
	}
	//Nhap vao mot con so va cho biet no la so chan hay le
	if (a%2==0) { 
	printf ("\n%d la so chan",a);}
	else { printf ("\n%d la so le",a);
	}
	//Nhap vao gio va cho biet no la ngay hay dem
	int b;
	printf ("\nNhap vao so gio: ");
	scanf ("%d",&b);
	if (b<=12) {
		printf ("\n%d gio la ban ngay",b);
	}
	else {printf ("\n%d gio la ban dem",b);
	}
}
