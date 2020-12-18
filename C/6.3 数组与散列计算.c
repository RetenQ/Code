#include <stdio.h>
int main (){
	//写一个程序，输入数量不确定的0-9范围的整数，统计每一种数字出现的次数。输入-1表示结束
	 int x;int i ;
	 const int number = 10 ;//定义常数整数10，因为10在这个程序中是一直出现的magic number 
	 int count [number] ; 
	 
	 for (i=0;i<number;i++){
	 	//利用循环初始化数组中的每一个数（遍历数组），在Java中好像不初始化的话会默认每个均为0
		 count[i] = 0 ; 
	 } 
	 
	 //*数组变量和本地变量一样，其不能得到默认的初始值。 
	 
	 //在此定义一个数组count ,count[X]的数值代表了X出现了多少次 
	 scanf("%d",&x);
	 while(x!= -1){
	 	if(x>= 0 && x<=9){
	 		count[x] ++ ; 
		 }
	 	scanf("%d",&x);//符合条件时，继续进入循环计算 
	 } 
	 for (i =0;i<number;i++){
	 	printf("数字 %d 出现了 %d 次 \n",i,count[i]);
	 }
	 
	 
	 
	;return 0 ; 
}
