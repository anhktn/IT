/* ve tam giac   *****
			      ****
				   ***
				    **
				     *  */
#include <stdio.h>
void main (){
	int i,a,b,n,m,p,j;
	printf("nhap vao do dai canh:");
	scanf("%d",&n);
	
	p=n;
	m=0;
	for(i=1;i<=n;i++){
		for(j=0;j<=m;j++){
			if (j==0){
				continue;
			}printf(" ");
		}for(a=1;a<=p;a++){
			printf ("*");
		}printf("\n");
		m++;
		p--;
	}	
}
			
