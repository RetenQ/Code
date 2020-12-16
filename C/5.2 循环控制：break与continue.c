#include  <stdio.h>
int main (void){
	int x ; 
	scanf ("%d",&x) ; 
	
	int i ;
	int k =0 ;//设置一个数值k来勇于判断最后的文字输出 
	if(x ==1){
		printf("1就是1");//1的情况 
	}else if (x<1){
		printf("EOORO"); //错误的情况 
	}else{
	
		for(i=2;i<x;i++){ //从2开始到x-1 
			if(x%i == 0) {
			k =1;	
			break; //!!在循环里面，运行至break时，结束该次循环（在这里加入是为了防止重复运算） 
			//continue :跳过循环这一轮剩下的语句进入下一轮（不做接下来的语句，回到循环开头） 	
			}
			printf("%d \n",i);
	} 
	if (k==1) printf("不是素数");
	else printf("是素数") ;
    }
	
	
	;return 0 ;
} 
