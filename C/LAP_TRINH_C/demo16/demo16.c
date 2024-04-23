#include <stdio.h>
#include <math.h>
void main (){
	// giai phuong trinh bac hai ax^2 +bx +c= 0
	float a,b,c,x1,x2,delta;
	printf ("Nhap vao he so a,b,c cua phuong trinh ");
	scanf ("%f %f %f", &a, &b, &c);
	
	// xu ly 
	if (a==0) { printf ("a phai khac 0");}
	else {  delta = b*b - 4*a*c ;
			if (delta > 0) { x1= (-b-sqrt(delta))/(2*a);
				    		 x2= (-b+sqrt(delta))/(2*a);
							 printf ("phuong trinh co hai nghiem la x1 = %.2f va x2 = %.2f", x1,x2);}
			else if ( delta = 0) { printf ("phuong trinh co nghiem kep x= %.2f", -b/(2*a));
			} else { printf ("Phuong trinh vo nghiem");}}		
}

