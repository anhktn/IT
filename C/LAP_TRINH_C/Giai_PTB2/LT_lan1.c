#include <stdio.h>
void main () {
	float a,b,c,x1,x2,x, delta;
	printf ("Nhap vao he so a =");
	scanf ("%f",&a);
	printf ("\nNhap vao he so b =");
	scanf ("%f",&b);
	printf ("\nNhap vao he so c =");
	scanf ("%f",&c);
	
	if (a==0) {
		if (b==0) { 
			if (c==0) {
					printf ("\nPhuong trinh vo so nghiem");
			}else {
					printf ("\nPhuong trinh vo nghiem");
			}
		}else { 
			if (c==0) {
					printf ("\nPhuong trinh co nghiem x = 0");		
			}else {
					x= -c/b;
					printf ("\nPhuong trinh co nghiem x = %.2f",x);
			}
			
		}
	}else { 
			delta = b*b - 4*a*c;
			if (delta>0) {
				 			x1= (-b-sqrt(delta))/(2*a);
				 			x2= (-b+sqrt(delta))/(2*a);
				 			printf ("\nPhuong trinh co 2 nghiem phan biet: x1 = %.2f va x2 = %.2f", x1,x2);
			} else if (delta=0){
							x= -b/(2*a);
							printf ("\nPhuong trinh co nghiem kep x= %.2f", x );
			}else {
							printf ("\nPhuong trinh vo nghiem");
			}
	}
}
