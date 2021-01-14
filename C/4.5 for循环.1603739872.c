#include <stdio.h>
int main (void)
{
	int n;
	scanf("%d",&n);
	int fact = 1;
	int i = 1 ;
	
	for (i=1;i<=n;i++){
	  // 初始条件;循环继续的条件;循环每一轮做的事情 
		fact *= i ;
	}
	printf("%d! = %d",n,fact);
	;return 0 ;
}
