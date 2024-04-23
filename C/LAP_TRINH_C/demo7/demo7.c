#include <stdio.h>
void main (){ 
int a,b;
printf (" Nhap vao gia tri cua a: ");
scanf ("%d", &a);
printf (" \nNhap vao gia tri cua b: ");
scanf ("%d", &b);

printf ("\n%d == %d là %d", a,b, a==b);
printf ("\n%d > %d là %d", a, b, a>b);
printf ("\n%d < %d là %d", a, b, a<b);
printf ("\n%d >= %d là %d", a, b, a>=b);
printf ("\n%d <= %d là %d", a, b, a<=b);
printf ("\n%d != %d là %d", a, b, a!=b);
}
