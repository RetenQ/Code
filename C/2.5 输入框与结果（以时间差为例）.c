#include <stdio.h>

int main()
{
// 运算符是指进行运算的的动作，比如加法运算符是 +，另外=也是运算符 
//算子是指参与运算的值，可能是常数、变量、一个方法的返回值 

int hour1,minute1;
int hour2,minute2;

printf("请输入“第一个小时的时分”如一点三十为 1 30  "); 
scanf(" %d %d",&hour1,&minute1);
printf("请输入“第二个小时的时分”如三点三十为 3 30  "); 
scanf(" %d %d",&hour2,&minute2);
	
int time1=hour1*60+minute1;
int time2=hour2*60+minute2;
int t=time2-time1;
printf("时间差是%d小时%d分钟。",t/60,t%60);

    
	;return 0 ;
	
	
 } 
