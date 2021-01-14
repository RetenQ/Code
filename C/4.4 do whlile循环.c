#include <stdio.h>
int main (void)
{
	// do while 进入循环的时候不会检查条件，而是在执行一次循环后再执行条件。如此反复
	/*
	do
	{
	   循环体语句 
	} while (循环条件);
	
	*/ 
	int x;
	scanf("%d",&x); 
	int n =0;
	do
	{
		x/=10;
		n++;
	}while (x>0);
	printf("%d",n);	
	
	
	
	
	; return 0 ;
 } 
