#include <stdio.h>
#include <math.h>

const float PI = 3.14; //bien toan cuc, global variable 
					   //em de dai, ham nao cung dung duoc em!!!
//tu duy viet ham cho bai MathHelper
void printMenu();
void computeDiskArea();

int main(){
	int choise; //su lua chon option
	do {
		printMenu();
		printf("Choose 1 ... 5: ");
		scanf("%d", &choise);
		
		switch(choise) {	//if choise la may thi lam gi? 
			case 1:
				computeDiskArea();//muon dung thi phai invoke em ra;
				break;
			case 2: 
				printf("You choose to compute the rectangle area\n");
				break;
			case 3:
				printf("You choose to compute the triangle area\n");
				break;
			case 5: 
				printf("Bye bye. See you next time\n");
				break;	
		}
	//chua bang 5 thi khong cho THOAT
	} while (choise != 5); //chua chon 5 ha, lam tiep di, in menu va moi goi
	
	return 0;
}
void printMenu() {
		printf ("\n--------------------MENU-----------------------\n");
		printf("|Welcome to Math Helper program                 |\n");
		printf("|Choose the following functions to play with:   |\n");
		printf("|1. Compute the disk area                       |\n");
		printf("|2. Compute the rectangle area                  |\n");
		printf("|3. Compute the triangle area                   |\n");
		printf("|4. Compute the ... area                        |\n");
		printf("|5. Quit                                        |\n");
		printf("-------------------------------------------------\n");
}
void computeDiskArea() {
		float radius, area;
		printf("You choose to compute the disk area\n");
		printf("Please input a radius (> 0): ");
		scanf("%f", &radius);
		//area = 3.14 * radius * radius; //cau lenh qua tam thuong
		//area = 3.14 * pow(radius, 2);
		//area = PI * pow(radius, 2);
		printf("The disk with r = %.2f has the area of %.2f\n", radius, (PI * pow(radius, 2)));
}
