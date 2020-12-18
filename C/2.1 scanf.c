#include <stdio.h>

int main()
{
	int price=0; //定义了一个变量，名字是price，类型int，初始值是0
	
	
	printf ("请输入金额");
	scanf("%d",&price);
	//scanf 用于把一些东西输入，这里表示把“”中的结果赋值给price变量，注意变量前的&要打 
	// scanf("%d %d",&a,&b); 可以同时定义多个输入量
	//每个%d和，后面的是对应的，如printf ("%d + %d = %d",a,b,a+b) 
	//scanf 里面写的东西是它会读到的东西。并且输入的格式要和scanf里面的相同
	//比如scanf("%d,%d") 你就要在运行时输入 2，3 。在scanf的格式字符串的东西，是之后要求你输入的东西 
	// 极端点，如果scanf("price%d"，&a) 就需要在运行时输入 price1 
	int change=100-price;
	//定义了第二个变量，并且还做了计算 
	//100是常量，为了方便修改的话我们也可以给常量整一个名字 const int AMOUNT= 100即可 
	//const为修饰符，加在int前面时代表给变量一个不变的属性，在初始化后，该变量的值便不能修改 
	
	printf("找您%d 元",change)
	
	;return 0 ;
	
	
	
	
 } 
