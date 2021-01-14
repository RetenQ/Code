#include <stdio.h>
int main (void){
	int type;
	scanf("%d",&type);
	 
	switch( type ){
		//根据switch(控制表达式子)，控制表达式只能是整数型的结果！ 
		//括号中的值判定接下来的语句，括号中可以是变量，可以是式子。都不符合就输出default。 
		case 1: 
			printf("这是case 1");
			break ; 
		/*
		case 常量 ：           （常量可以是常数，也可以是只含常数运算的表达式） 
		    语句......（一般以break结尾） 
		    
		    都是短句子的话好像 case xx: xx xxxx xxx ;break ；更美观 
		*/	
		case 2:
			printf("这是case 2");
			break ; 
		case 3:
			printf("这是case 3");
			//break ; 注意这个break被注释删掉了，case=3时会执行3然后到执行case4后停止！ 
		case 4:
			printf("这是case 4");
			break ; 
	
	default:
		printf("阿这，这不是case1234");
		//最后以default结尾来对应其他情况。 
			}
	
	;return 0 ;
}

/*  case只是一个路标，并不会自动停止。甚至会运行到下一条case里面去执行句子（按排序的顺序）
    这个动作会直到遇到一个break或者到达switch结束，才会停止下来。 
 */
