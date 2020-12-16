#include <stdio.h>
//因为主要是说明嵌套循环的，所以判断素数的代码经过了简化 
int main(void){
	int x ; 
	x=6;
	for(x=2;x<100;x++)
	{		
		int i;
		int isPrime=1; //x是素数 
		for(i=2;i<x;i++){
			if(x%i ==0){
				isPrime = 0 ;
				break;
			}
		//！！注意，循环与被嵌套的循环中，改变的变量(x,i)要不同，以免混淆	
		}
		if(isPrime ==1){
			printf("%d \n",x);
		}
    }
	printf("\n");
	 
	;return 0 ; 
} 
