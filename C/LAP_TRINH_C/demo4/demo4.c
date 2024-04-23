#include <stdio.h>
void main (){
	int x;
	float y;
	char c;
	
	// nhap vao ky tu
	printf ("\nnhap vao ky tu:");
	scanf ("%c", &c);
	printf ("\ngia tri c vua nhap la: %c",c );	
	
	// nhap vao so nguyen 
	printf (" \nNhap vao gia tri cua x: ");
	scanf ( "%d", &x );
	printf ("\ngia tri cua x la: %d", x);
	
	// nhap vao so thuc
	printf (" \nnhap vao gia tri cua y: ");
	scanf ( "%f", &y);
	printf ( "\ngia tri cua y là: %.2f",y);
	
	// nhap nhieu du lieu cung mot hang
	float x1, x2, x3 ;
	printf ("nhap vao gia tri cua x1, x2, x3:");
	scanf ("%f%f%f", &x1, &x2, &x3);
	printf ("\nx1=%f, x2=%f, x3=%f", x1, x2, x3);
}
