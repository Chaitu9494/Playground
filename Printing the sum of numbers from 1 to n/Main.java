#include <stdio.h>
int main() {
	int n,i,sum=0,value;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&value);
    sum=sum+i;
  }
  printf("%d",sum);
    
	return 0;
}