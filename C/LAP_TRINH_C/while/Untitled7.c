#include <stdio.h>
#include <math.h>
void main(){
	int i=1;
	float n, tong=0;
	printf ("Nhap vao gia tri cua n : ");
	scanf ("%f",&n);
	while (i<=n) {
		tong+=(1.0/i);
		i++;
	}
	printf ("Tong day so = %.2f",tong);	
	
}
