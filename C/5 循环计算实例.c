#include <stdio.h>
int main (void)
{
int count = 100;
while (count > 0) {
	printf("%d  \n",count);// a
	count--;               //b
}	
	printf("发射！\n"); 
//当我们想要模拟测试一个比较大的循环时，可以采用一个小的数进行实验。 
//比如我们想要知道ab顺序带来的不同时，可以先用count = 3 进行测试。 
	;return 0;
 } 
