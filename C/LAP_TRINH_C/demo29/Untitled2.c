//in ra so chinh phuong nho hon n
#include <stdio.h>
//tao ham
int checkSoChinhPhuong(int x){
	int i;
	if (x<1) return 0;
	for (i=1;i<=x;i++){
		if (i*i==x)
			return 1;
	}
	return 0;
}
void main (){
	//nhap lieu
	int n,i;
	printf ("Nhap vao n: ");
	scanf ("%d",&n);
	//goi ham
	for (i=1;i<=n;i++){
		if (checkSoChinhPhuong(i)==1)
			printf ("%d ",i);
	}	
}
