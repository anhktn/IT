/* ve tam giac		 	*						
			           ***
					  *****
					 ******* 
					*********  */
#include <stdio.h>
void main (){
	int i,chieuCao,j,a;
	printf("Nhap vao chieu cao: ");
	scanf("%d",&chieuCao);
	
	for (i=1;i<=chieuCao;i++){
	//xu ly ky tu [ ]		
		for(j=1;j<=chieuCao-i;j++){
			printf(" ");
	//xu ly ky tu *
		}for(a=1;a<=2*i-1;a++){
			printf("*");
		}printf("\n");		
}
}
