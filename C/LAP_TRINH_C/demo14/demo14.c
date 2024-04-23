#include <stdio.h>
void main(){
	//giai phuong trinh ax+b=0
	int a,b;
	printf ("Nhap vao he so cua phuong trinh ax+b=0");
	printf ("\nNhap vao gia tri cua a = ");
	scanf ("%d",&a);
	printf ("\nNhap vao gia tri cua b = ");
	scanf ("%d",&b);
	if (a==0) { if (b==0) { printf ("\nPhuong trinh vo so nghiem");}
	
            	else { printf ("\nPhuong trinh vo nghiem");}
}
	if (a!=0) { printf ("\nPhuong trinh co nghiem la x = %.2f", (float)-b/a);}	
}

