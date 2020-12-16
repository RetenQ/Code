#include <stdio.h>
int main()
{
	int a,b,c;
	printf("请输入三个数字") ;
	scanf("%d %d %d",&a,&b,&c) ;	
	int max=0;
    //当if的条件满足或不满足时，执行的语句可以是一条if或者一套if-else语句，这就是嵌套的if语句 
	if(a>b)	{
		if(a>c){
			max=a;
		}
		
		else {
			max=c;
		}
		
		}
		
		
	else{
			if(b>c){
				max=b;
			}
		else{
		max=c;
		}
	}
	// !!! 简洁版的else总是和最近的if相匹配！而完整版的（有大括号）是根据大括号的划分的范围匹配的！
	//（可能是废话）缩进格式并不能暗示else的匹配	
		
	//改了这么多次我只想说：注意{}的对应，fuck
	
	//另外也可以用简要版的ifelse写，简洁但是有风险 
	printf("The max is %d \n",max);
	; return 0 ;
}
