#include <stdio.h>

int main()
{
	const double RATE=8.25 ; //const 修饰的变量只有只读性
	const int STANDARD = 40;
	double pay = 0.0 ;
	int hours; //先定义 hours，后面由用户赋值来完成hours的初始化 
	
	printf("请输入工作的小时数 ： ");
	scanf ( "%d", &hours); //hours的初始化完成 
	printf("\n");
	
	if(hours>STANDARD)
	  pay=STANDARD*RATE+(hours-STANDARD)*(RATE*1.5);
	
	else
	pay=hours*RATE;
	
	//事实上，还是建议每次都打大括号 
	
	printf("工资是：%f \n",pay);  //注意这里用的是%f 
	
	
	;return 0 ;
 } 
