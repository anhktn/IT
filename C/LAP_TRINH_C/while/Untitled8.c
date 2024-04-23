#include <stdio.h>
void main (){
	int n;
	float a, ketqua;
	printf ("Nhap vao co so a : ");
	scanf ("%f",&a);
	printf ("\nNhap vao so mu n : ");
	scanf ("%d",&n);
	ketqua = pow(a,n);
	
	printf ("ket qua luy thua = %.2f",ketqua);
	
}
