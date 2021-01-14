#include <stdio.h>
int main (void)
{
	int n;
	scanf("%d",&n);
	int fact = 1;
	int i = 1 ;
	
	for (i=1;i<=n;i++){
	  // 初始条件;循环继续的条件;循环每一轮做的事情。可以把for读成 “对于”  
		fact *= i ;
	}
	printf("%d! = %d",n,fact);
	;return 0 ;
}
/*小技巧，做求和时，记录结果的变量应该初始化为0；
          做求积时，一般初始化为1（就像这次的fact） 
          
          如果循环有固定次数（如n!），用for循环
		  必须执行一次，用do_while
		  其他情况一般用while 
*/ 

//for循环和while循环实际上是等价的，是可以互通的。for(;条件;) 就是 while(条件)  。 
