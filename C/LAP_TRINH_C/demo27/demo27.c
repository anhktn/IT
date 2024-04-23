#include <stdio.h>
int check_SNT (int x){
	int i;
	if (x<=1) return 0;
	for (i=2;i<x;i++){
		if (x%i==0) return 0;	
	}
	return 1;
}
void main (){
	int n;	
	printf ("Nhap vao n: ");
	scanf ("%d",&n);
	int kq = check_SNT(n);	
	if (kq==0)
		printf ("%d khong phai la so nguyen to",n);
	else 
		printf ("%d la so nguyen to",n);
	
}
