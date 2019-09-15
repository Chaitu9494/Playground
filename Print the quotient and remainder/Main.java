#include<stdio.h>
int main()
{
  int a=365,b=4,Quotient,Remainder;
  scanf("%d %d",&a,&b);
  Quotient=a/b;
  Remainder=a%b;
  printf("Quotient: %d\n",Quotient);
  printf("Remainder: %d",Remainder);
  return 0;
}