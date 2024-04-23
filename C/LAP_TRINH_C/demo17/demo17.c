#include <stdio.h>
void main (){
	int a;
	printf ("nhap vao so a = ");
	scanf ("%d", &a);
	
	switch (a){
		case 1: printf ("\nChu nhat");
				break;
		case 2: printf ("\nthu hai");
				break;
		case 3: printf ("\nthu ba");
				break;
		case 4: printf ("\nthu tu");
				break;
		case 5: printf ("\nthu nam");
				break;
		case 6: printf ("\nthu sau");
				break;
		case 7: printf ("\nthu bay");
				break;
	default: printf ("\nNhap sai du lieu");
	}
}
