#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  printf("%d",greatest_of_three_num(n1,n2,n3));

  	return 0;
}
int greatest_of_three_num(int num1,int num2,int num3)
{
  int max=0;
  if(num1> num2)
  {
    max=num1;
  }
  else if(num2>num3)
  {
    max=num2;
  }
  else
  {
    max=num3;
  }
  return max;
}