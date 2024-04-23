#include <stdio.h>
void main (){
	int a,b;
	printf ("Nhap vao gia tri cua a=");
	scanf ("%d",&a);
	printf ("\nNhap vao gia tri cua b=");
	scanf ("%d", &b);
	
	float ketqua = (float)a/b;
	printf ("\nketqua = %.2f", ketqua);
	
	int ketqua1= (int)ketqua;
	printf ("\nketqua1= %d", ketqua1);
}
