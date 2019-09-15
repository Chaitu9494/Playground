#include<stdio.h>
int main()
{
  int perimeter,area,length=6,breadth=9;
  scanf("%d %d",&length,&breadth);
        perimeter=length*breadth;
        area=2*(length+breadth);
        printf("The perimeter of the rectangle is: %d cm\n",area);
        printf("The area of the rectangle is: %d sq cm",perimeter);
  return 0;
}