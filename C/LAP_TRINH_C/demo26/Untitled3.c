//Nhap vao n va xuat ra man hinh cac so le tu 1 den n
#include <stdio.h>
void main (){
	int n,i;
	Nhap: 
	printf ("Nhap vao so n: ");
	scanf ("%d",&n);
	if (n<=0) goto Nhap;
//khi do neu n<=0 thi ctr se nhay len dong thu 6
	
	printf("\nDay so le la:");
	for ( i=1;i<=n;i++){
		if (i%2==0) continue; 
		printf (" %d",i);
//khi gap lenh continue ctr se bo qua cau lenh chua continue va tiep tuc nhay len vong lap for				
	}
}
