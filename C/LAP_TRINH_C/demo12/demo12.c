#include <stdio.h>
#include <math.h>
void main (){
	
	int a,b;
	printf ("Nhap vao gia tri cua a=");
	scanf ("%d", &a),
	printf ("\nNhap vao gia tri cua b=");
	scanf ("%d", &b);
	
	float ketqua = (float)a/b;
	printf ("\nketqua = %.2f", ketqua);
	printf ("\nfloor ketqua = %.2f", floor(ketqua));
	printf ("\nceil ketqua = %.2f", ceil(ketqua));
	printf ("\nsqrt 9=%.2f", sqrt(9));

	printf ("\npow 5^2= %.2f", pow(5,2));
	printf ("\nabs|5| =%.2f", fabs(5));
	// abs la dung cho so nguyen->%d, neu muon sd so thuc phai sua thanh fabs->%f
}
