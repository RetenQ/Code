#include <stdio.h>
int main(){
	//写一个程序，计算平均数并输出大于平均数的数字 
	
	int x ;
	double sum = 0;
	int cnt = 0 ;
	int number [100]; //定义一个数组，其大小为100个 
	//int 名字A [大小X] 表示这个数组A里面最多可以放 X个int    
	
	scanf("%d",&x);
	while (x! = -1){
		number [cnt] = x ;  //让数组上cnt位置的那个单元=x ；而cnt是递增的，所以x分别会在1，2，3....位置上存放 
		//对数组中的元素进行赋值
		 
		sum += x ;
		cnt ++;
		scanf ("%d",&x);
	} 
	if (cnt > 0 ){
		printf("%f \n",sum/cnt);
		int i ;
		for (i = 0 ; i<cnt;i++){  //进行数组数字的输出。遍历数组
		//遍历数组:浏览整个数组 
		 
			if (number[i]>sum/cnt){//使用数组中的元素 
				printf("%d \n",number[i]);
				//当数组i位置的数符合条件，输出它 
			}
			
		} 
	}
	
	;return 0 ;
}
