/*Bài toán:
	Viet chuong trình nhap tháng nam.
	Hãy tìm só ngày trong tháng dó và xuat ra màn hình */
#include <stdio.h>
void main () {
	int a,b ;
	printf ("Nhap thang nam can tim ");
	printf ("\nthang =");
	scanf ("%d", &a);
	printf ("\nam =");
	scanf ("%d", &b);
	
	switch (a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
	    	printf ("\nCo 31 ngay");
	    	break;
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    	printf ("\nCo 30 ngay");
	    	break;
		case 2: if (b%400==0 || (b%4==0 && b%100!=0)) {
					printf ("\nCo 29 ngay");	
				} else printf ("\nCo 28 ngay");
			break;
			
		}
}
