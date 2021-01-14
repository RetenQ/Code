#include <stdio.h>
int main()
{
	int x ;
	int one,two,five;
	
	//scanf("%d",&x);
	x = 2;

    int exit = 0 ;//设置一个变量用于确认break的跳出 ，这种break叫做接力break。 
	
	for ( one=1;one<x*10/1;one++){
		
		for(two=1;two<x*10/2;two++){
			
			for(five=1;five<x*10/5;five++){
				if(one+two*2+five*5 == x*10){
					printf("可以用%d个1角加%d个2角加%d个5角得到 %d 元\n",one,two,five,x);
					exit = 1;
					break; 
					//goto out ; //goto的用法见尾 
				}
			}	
			if(exit) break ; //直接写exit就表示exit ==1 ; 
		}
	if(exit) break;
	}
	//break和continue 只会对它所在的循环做  
	
	//out ： 
	;return 0 ;
	/*
	   goto A ;将程序跳转至A处 
	 A :         A处，注意后面是冒号  
	
	*/ 
 } 
