#include <stdio.h>
int main()
{

int price=0;
int bill =0;

printf("请输入金额 ");
scanf("%d",&price); 
printf("请输入票面 ");
scanf("%d",&bill); 

if(bill>=price)     //注意了，if和else的分号;不写在小括号后面，因为这不是他们真正“结束”的地方 
{
	printf("应该找您： %d \n", bill-price);
}

/*当判断运算符输出不为0时，会执行大括号内的语句，否则执行else语句。
if+else判断完之后，之后的语句照常进行 */
 
else {
	printf("你的钱不够  \n"); 
}

printf("执行结束"); 

; return 0 ;
}
