#include <stdio.h>

//viet ham tinh n!
//IPO
//I: n
//P: 1.2.3.4...n
//O: ket qua nhan don!!!
// chon loai ham nao vi co toi 4 loai ham
//viet thu ca 4
void getFactorialV1();
void getFactorialV2(int n);
int getFactorialV3(); 
int getfactorialV4(int n);    //xoát ca, y = f(x) = x^2...

int main (){
	//getFactorialV1();
	//getFactorialV2(6); //1.2.3.4.5.6 =720
	//int result = getFactorialV3();	//may la ham oi ve value
									//hung value de dung
	//printf ("result: %d\n", result);
	//printf ("result: %d\n", getFactorialV3());
									//may la value acc ngam trong do
									//in acc hien than qua ten ham!!!
	getFactorialV4(6); //ngam tra ve 120, eo them in
					   // neu in k R-USE duoc tot nhat!!!
	printf("result: %d \n", getFactorialV4(6));
		
}
int getFactorialV4(int n){
	int acc = 1; 	
	if (n == 0 || n == 1)
		acc = 1; 
	else //tam thoi cua chan vu n < 0
		 // coi nhu tam chap nhan n = 2 3 4 5 6 7 8 
		for (int i = 2; i <= n; i++)
		 	acc *= i;  //acc = acc * i;
	//printf ("%d! = %d", n, acc);    //khong nen printf khi ham tra ve gia tri
	return acc;
}		
int getFactorialV3(){
	int n, acc = 1; //0 danh cho tong don; tich thi ban dau te nhat 1
				   	//1 nhan voi ai cung k anh huong ai do
	printf("Input a number (>= 0) to get the factorial: ");
	scanf("%d", &n); //co kha nang nhap ca chon!!! VALIDATION DA TUNG HOC
	
	if (n == 0 || n == 1)
		acc = 1; 
	else //tam thoi cua chan vu n < 0
		 // coi nhu tam chap nhan n = 2 3 4 5 6 7 8 
		for (int i = 2; i <= n; i++)
		 	acc *= i;  //acc = acc * i;
		 	
	//return acc;    //do ham k return thi phai in ra!!!
	//printf ("%d! = %d", n, acc);    //khong nen printf khi ham tra ve gia tri
	return acc;
}		 
void getFactorialV2(int n){
	int acc = 1;  //0 danh cho tong don; tich thi ban dau te nhat 1
					//1 nhan voi ai cung k anh huong ai do
	if (n == 0 || n == 1)
		acc = 1; 
	else //tam thoi cua chan vu n < 0
		 // coi nhu tam chap nhan n = 2 3 4 5 6 7 8 
		 for (int i = 2; i <= n; i++)
		 	acc *= i;  //acc = acc * i;
		 	
	//return acc; do ham k return thi phai in ra!!!
	printf ("%d! = %d", n, acc);    
}		
void getFactorialV1(){
	int n, acc = 1; //0 danh cho tong don; tich thi ban dau te nhat 1
				   	//1 nhan voi ai cung k anh huong ai do
	printf("Input a number (>= 0) to get the factorial: ");
	scanf("%d", &n); //co kha nang nhap ca chon!!! VALIDATION DA TUNG HOC
	
	if (n == 0 || n == 1)
		acc = 1; 
	else //tam thoi cua chan vu n < 0
		 // coi nhu tam chap nhan n = 2 3 4 5 6 7 8 
		for (int i = 2; i <= n; i++)
		 	acc *= i;  //acc = acc * i;
		 	
	//return acc;    do ham k return thi phai in ra!!!
	printf ("%d! = %d", n, acc);    
	}		 

