#include <stdio.h>
int getfactorialV4(int n);

int main() {
  printf("0! = %d\n", getFactorialV4(0));
  // may la 1 value xai luon khoi can gan bien khac!!!
  printf("6! = %d", getFactorialV4(6));
}
/*int getFactorialV4(int n) {
  int acc = 1;
  //return 69; //thu cai choi
              //vua vao ham co gia tri luon, k care phan con lai
  if (n == 0 || n == 1)
    return 1; //biet ngay 0! = 1! = 1, thoat luon
  else // tam thoi cua chan vu n < 0
       // coi nhu tam chap nhan n = 2 3 4 5 6 7 8
  {
    for (int i = 2; i <= n; i++)
      acc *= i;
    return acc;
  }
   printf ("ahihi");
  //cau lenh nay CPU k cham toi duoc do return o tren roi
}
*/
/*int getFactorialV4(int n) {
  int acc = 1;
  if (n == 0 || n == 1)
    acc = 1;
  else // tam thoi cua chan vu n < 0
       // coi nhu tam chap nhan n = 2 3 4 5 6 7 8
    for (int i = 2; i <= n; i++)
      acc *= i;
  return acc;
}
*/
int getFactorialV4(int n) {
  int acc = 1;
  if (n == 0 || n == 1){
     acc = 1; 
    return 1; // biet ngay 0! = 1! = 1, thoat luon
  }
   
  // chua chan n am!!!
  // bo else luon moi xin!!! Return S?M BAO BAO HÀM S? LO?I TR?, THOÁT LUÔN, PH?N CÒN L?I LÀ ELSE R?I KHÔNG C?N ELSE N?A
  for (int i = 2; i <= n; i++)
    acc *= i;
  return acc;
}
