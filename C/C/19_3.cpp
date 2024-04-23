#include <stdio.h> 
//viet app in ra tong cua day so sau
//1! + 2! + 3! + 4! + 5!
//bi phuc tap, ta che nho ra, co su lap lai cua role tinhGiaiThua() - tach ham
int getFactorial(int n){		//v4 - soai ca- reuse
	int acc = 1;
	if (n == 0 || n == 1){
		return 1;
	}
	for (int i = 2; i <= n; i++) // chua chan duoc truong hop n < 0, tam chap nhan n > 2
		acc *= i;
	return acc;
}
int main (){
	int sum = 0;
	for (int i =1; i <= 5; i++)
		sum += getFactorial(i);
	printf ("Sum of factorial chain from 1 to 5: %d", sum);
	
	
}
