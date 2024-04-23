#include <stdio.h>
	void main(){
	int a;
	printf ("Nhap vao gia tri cua a= ");
	scanf ("%d",&a);
	printf("%d la %s",a,(a%2==0)?"CHAN":"LE");
}
