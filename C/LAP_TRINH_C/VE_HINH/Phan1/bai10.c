/*ve tam giac  	*********
				 *******
			      *****
				   ***
				   	*   */					 
#include <stdio.h>
void main (){
	int chieuCao,i,j,a,b;
	printf("nhap vao chieu cao: ");
	scanf("%d",&chieuCao);
	b=1;
	for(i=1;i<=chieuCao;i++){
		for(a=1;a<=i-1;a++){
			printf(" ");
		}for(j=1;j<=2*chieuCao-b;j++){
			printf("*");
		}	printf("\n");
			b=b+2;
		}
}
