#include <stdio.h>
void sum(int begin,int end){
	int i ; 
	int sum = 0 ; 
	for(i=begin ; i<=end ;i++){
		sum+= i;
	}
	printf("%d 到 %d的和是%d \n",begin,end,sum);
}
/*
在这里，我们在主函数之前定义了一个自己的函数sum 
*/
int main (void){
	sum(1,10);//在这里，我们运用了自己的sum函数 
	sum(20,30);
	sum(35,45); 
	; return 0 ;
} 
