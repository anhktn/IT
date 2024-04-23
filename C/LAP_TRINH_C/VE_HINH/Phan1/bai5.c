/*ve tam giac   *
			 	**
			 	***
			 	****  */
		 	
#include <stdio.h>
void main (){
	int i,j,n;
	printf("Nhap vao do dai canh: ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			if (j==1||i==n)
				printf("*");
			else if (j<=i)
				printf("*");
			else
				printf(" ");
		}printf("\n");
	}
}
