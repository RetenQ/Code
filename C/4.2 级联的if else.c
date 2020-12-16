#include <stdio.h>

int main(void)
{ 
int x ;
int f = 0;
scanf("%d",&x);
    if(x<0) {
    	f = -1;
	}else if (x==0){
		f = 0;
	}else if (x>5){
		f=2*x;
	}else {
		f=3*x;
		
	}
	
	printf("%d",f)
	;return 0 ;
 } 
