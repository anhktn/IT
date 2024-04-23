/* ve tam giac  ****
				***
				**
				*    */
		  
#include <stdio.h>
void main(){
	int n,i,j,m;
	printf("Nhap vao canh:");
	scanf("%d",&n);
	m=n;
	for(i=1;i<=n;i++){
		for (j=1;j<=m;j++){
			printf("*");
		}m--;
		printf("\n");
	}
}
