#include <stdio.h>
void main (){
	int min,max,i;
	int tong=0, bienDem=0;
	float trungbinhtong;
	
	printf ("Nhap vao min: ");
	scanf ("%d",&min);
	printf ("Nhap vao max: ");
	scanf ("%d",&max);
	
	i=min;
	while (i<=max) {
	    if (i%2==0) {
			tong+=i;
			bienDem++;			
		} i++;
		  			
		}
		
		trungbinhtong= tong/bienDem;
		printf ("\nTrung binh tong la %.2f",trungbinhtong);
}
