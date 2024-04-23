#include <stdio.h>
void main (){
	int n,i=1, tong=0;
	printf ("Nhap vao so n =");
	scanf ("%d",&n);
	while (i<=n) { 
		tong = tong + i;
		i++;
	}
	printf ("tong =%d",tong);
}
