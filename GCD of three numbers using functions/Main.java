#include<stdio.h>
int main()
{
  int n1,n2,n3,result;
  scanf("%d %d %d",&n1,&n2,&n3);
  result=gcd_of_2_numbers(n1,n2);
  printf("%d",gcd_of_2_numbers(result,n3));
  return 0;
}
int gcd_of_2_numbers(int n1,int n2,int n3)
{
  int min,gcd;
  if(n1>n2)
  {
    min=n2;
  }
  else
  {
    min=n1;
  }
  while(min>=1)
  {
    if(n1%min==0 && n2%min==0)
    {
      gcd=min;
      break;
    }
    else
    {
      min--;
    }
  }
  return gcd;
}