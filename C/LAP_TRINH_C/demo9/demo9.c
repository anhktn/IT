#include <stdio.h>
void main(){
	int a,b;
	printf ("Nhap vao so a:");
	scanf ("%d",&a);
	printf ("Nhap vao so b:");
	scanf ("%d",&b);
	//xuat du lieu 
	printf ("\nMIN l� %d",(a<=b)?a:b);
	printf ("\nMAX l� %d",(a>=b)?a:b);
}
