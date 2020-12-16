#include <stdio.h>
int main (void)
{

int x;
int n=0;
scanf("%d", &x);

n++;
x/=10;//实质就是 x=x/10
while (x>0)
{
	n++;
	x/=10;
	//一个循环内要有可以改变循环条件的命令（比如这里的x/=10），否则程序可以编译，但运行的时候会卡在循环出不去 
 } 
 //循环语句，当X>0的时候会一直执行它。
 
 printf("%d \n",n) ;
 ; return 0;
 
 }
