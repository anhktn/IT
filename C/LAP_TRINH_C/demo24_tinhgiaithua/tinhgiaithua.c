#include <stdio.h>
void main (){
	int n,i, giaiThua=1;
	do{
		printf ("Nhap vao so n: ");
		scanf ("%d",&n);
	}while (n<=0);
	
	for (i=1;i<=n;i++){
		giaiThua= giaiThua*i;
	}printf ("\nGiai thua cua %d la: %d",n,giaiThua);
}
