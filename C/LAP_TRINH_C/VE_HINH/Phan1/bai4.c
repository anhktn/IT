#include <stdio.h>
void main (){
	int i,j,n,m;
	printf("Nhap vao chieu dai:");
	scanf("%d",&n);
	printf("\nNhap vao chieu rong:");
	scanf("%d",&m);
	
	for(i=1;i<=m;i++){
		for(j=1;j<=n;j++){
			if(i==1||i==m||j==1||j==n)
				printf("*");
			else 
				printf("~");
		}printf("\n");
	}
}
