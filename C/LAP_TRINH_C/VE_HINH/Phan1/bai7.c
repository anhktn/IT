/* ve tam giac: 		*
					   **
					  ***  
					 ****
					*****         */
#include <stdio.h>
void main(){
	int n,i,a,b,m;
	printf("Nhap vao canh:");
	scanf("%d",&n);
	m=n;
	for(i=1;i<=n;i++){
		for (a=1;a<=m-1;a++){
			printf(" ");
		}for (b=1;b<=i;b++){
			printf("*");
		}printf("\n");
		m--;
	}

}
