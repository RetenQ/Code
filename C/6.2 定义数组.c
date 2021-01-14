#include <stdio.h>
int main (){
	/*定义数组
	<类型> <名称> [元素数量]        这里的类型是指数组内部存储的数据的类型 
	int grades[100]; 
	doubke weight[20];
	另外，元素数量必须是整数
	*在C99之前：元素数量必须是编译时刻确定的字面量 (不能是变量、程序运行过程中动态产生的数字)
	*/ 

	int x ;
	double sum = 0 ;
	int cnt ;
	printf("请输入数字的数量 ：");
	scanf("%d",&cnt);
	
	if(cnt>0){
		int number[cnt];
		printf("下面输入你要平均的数");
		scanf("%d",&x);
		while (x != -1){
			number [cnt] =x;
			sum += x ;
			cnt++ ;
			scanf("%d",&x);
		} 
		
	} 
	
	
	
	; return 0 ;
 } 
 
 /*
 1.数组中的元素具有相同的数据类型
 2.一旦创建，数组不能改变其大小
 3.使用数组时在[]中的数字是下标/索引，下标从0开始计数 
 4.！！无论是编译器还是运行环境，都不会去检查下标是否越界，无论你在读还是写(segmentation fault) 
 
 3.*数组中的元素在内存中是连续依次排列的 
    可以创建长度为0的数组，但是没什么锤子用 
 
 */ 
