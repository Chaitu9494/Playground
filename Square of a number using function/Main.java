#include<stdio.h>
int square_of_a_number(int num);
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  printf("%d",square_of_a_number(n));
  
   return 0;
}
int square_of_a_number(int num)
{
  int result;
  result=num*num;
  return result;
}