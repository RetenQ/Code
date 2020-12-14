#include <stdio.h>

int main ()
{
	int hour1,minute1;
    int hour2,minute2;

printf("请输入“第一个小时的时分”如一点三十为 1 30  "); 
scanf(" %d %d",&hour1,&minute1);
printf("请输入“第二个小时的时分”如三点三十为 3 30  "); 
scanf(" %d %d",&hour2,&minute2);	

int ih=hour2-hour1;
int im=minute2-minute1;

if (im<0){
	im=60+im;
	ih--;
}

printf("时间差是%d小时%d分钟。",ih,im);
	/*if语句的标准写法：
	 
	   if(条件成立){
	      ... 
	      }             */
	
	;return 0;
}
