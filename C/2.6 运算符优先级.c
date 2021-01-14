#include <stdio.h>

int main()
{
	int a ; 
	printf("输入原始金额 "); 
	scanf("%d",&a);
    double final=a*(1+0.033)*(1+0.033)*(1+0.033);
	printf("计算得到复利为%f \n",final);
	double b=final-a ;
	printf("总利息为%f",b);
 return 0;
}

// 算术的优先级和平常计算一样，此外-a或者+b这样的变化正反的优先级最高，如 5*-1 = -5（单目运算） 
//在C中，=即赋值也是运算符且自右向左运算，比如a=b=6即是a=(b=6) ,这个作为人比计算机好理解，不用记 
//赋值的运算优先级最低 ，单目和赋值是自右向左 
