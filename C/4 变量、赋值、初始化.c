#include <stdio.h>

int main()
{
	int price=0; //定义了一个变量，名字是price，类型int，初始值是0
	
	
	//变量定义的一般形式是 <><变量名称>;  如int price. ;表示这行程序结束了 
	//int A,B 可以同时定义两个为A,B的变量，类型同为int 
	//每一个变量都有一个为一的标识符，只能又字母、数字、下划线组成，且数字不能在第一个位置。
	//C语言的关键字不能做标识符 
	
	// = 是赋值运算符，将右边的的值赋给左边  ，所有的变量被使用前都要被赋值
	
	//所有变量必须有确定的数据类型，表示变量中可以存放什么类型的数据，运行过程中不能改变类型 
	
	//综上，变量初始化为 <类型名称><变量名称>=<初始值>  int A=0,B=10 
	 
	printf ("请输入金额");
	scanf("%d",&price);
	
	int change=100-price;
	//定义了第二个变量，并且还做了计算 
	
	printf("找您%d 元",change)
	
	;return 0 ;
	
	
	
	//PS:C99可以在变量使用前定义它都可以，而传统的ANSI C只能在代码开头定义变量 
	
	
 } 
