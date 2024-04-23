#include <stdio.h>
#include <math.h>
void main (){
	//khai bao
	float xA,yA,xB,yB,xC,yC;
	float AB, AC, BC;
	float chuvi, nuachuvi, dientich;
	//Nhap du lieu
	printf ("Nhap vao toa do dinh A ");
	scanf ("%f,%f",&xA,&yA);
	printf ("\nNhap vao toa do dinh B ");
	scanf ("%f,%f",&xB,&yB);
	printf ("\nNhap vao toa do dinh C ");
	scanf ("%f,%f",&xC, &yC);
	// Xu ly
	AB = sqrt(pow(xA-xB,2)+ pow(yA-yB,2));
	AC = sqrt(pow(xA-xC,2)+ pow(yA-yC,2));
	BC = sqrt(pow(xB-xC,2)+ pow(yB-yC,2));
	printf ("\nAB=%.2f",AB);
	printf ("\nAC=%.2f",AC);
	printf ("\nBC=%.2f",BC);
	if ((AB+AC)>BC && (AB+BC)>AC && (AC+BC)>AB){ printf ("\nABC co tao tanh mot tam giac");
	} else {printf ("\nABC khong tao thanh tam giac"); 
	}
	//kiem tra xem ABC co can hay khong?
	if ((AB=AC)||(AB=BC)||(AC=BC)) {printf("\nABC la tam giac can");
	} else { printf ("\nABC khong la tam giac can");
	}
	//tinh chu vi tam giac ABC
	chuvi= AB+AC+BC;
	printf ("\nChu vi =%.2f ", chuvi);
	nuachuvi = chuvi/2;
	dientich = sqrt(nuachuvi*(nuachuvi-AB)*(nuachuvi-AC)*(nuachuvi-BC));
	printf ("\ndien tich = %.2f", dientich);
	
}
