#include<stdio.h>
int main()
{
	int arr_size;
	scanf("%d",&arr_size);
	int a[arr_size];
	for(int idx=0;idx<=arr_size-1;idx++)
	{
		scanf("%d",&a[idx]);
	}
	int max_no;
	
	if(a[0]>a[1])
	{
		max_no=a[0];
	}
	else{
		max_no=a[1];
	}
	for(int idx=0;idx<=arr_size-1;idx++)
	{
		if(max_no<a[idx])
		{
			max_no=a[idx];
		}
	}
	printf("%d",max_no);
	return 0;
}