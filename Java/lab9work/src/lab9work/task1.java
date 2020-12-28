package lab9work;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		
	int[][] graph =new int [12][12];//创建代表表格的数组
	
	String B=new String ("exit");//exit字符用于判定退出
	
	//输入九个字符串用于判定是否是合法的输入，以这个来避免a=Integer.parseInt(A);的报错
	String N1=new String ("0");
	String N2=new String ("180");
	String N3=new String ("360");
	String N4=new String ("45");
	String N5=new String ("225");
	String N6=new String ("90");
	String N7=new String ("270");
	String N8=new String ("135");
	String N9=new String ("315");
	
	int judge = 0;//用于选择mode
	int a = 2 ;
	
	Scanner putin =new Scanner(System.in);
	String A=putin.nextLine();
	
	//以下是“Mode”的判定区块
	if(A.equals(B)) {
		judge = 3 ; //如果是exit，判定为模式3
	}else if(A.equals(N1)||A.equals(N2)||A.equals(N3)||A.equals(N4)||A.equals(N5)||A.equals(N6)||A.equals(N7)||A.equals(N8))
	{ 	judge =1 ;//如果是合法的，判定为可执行的模式1
		a=Integer.parseInt(A);
		//用a来得到我们获取的数字
		}else judge = 2 ; //如果不是以上情况，则是非法需重输入的模式2
	//
	
	
	while(judge == 1 || judge == 2 ) {
		//当是模式1 2的时候，进入循环。 当是模式3时候才会退出
		if(judge ==1) {
			//如果是合法的输入 0 180 360 45 225 90 270 135 315 
			
			//第一个类型	
			if(a==0||a==180||a==360)
			{
				for(int b =0;b<12;b++)
				{
					for(int c =0;c<12;c++)
					{
						if(b==5||b==6) graph[b][c]=0;
						else           graph[b][c]=1;
					}	
				}
			}
			
			
			//第二个类型
			if(a==45||a==225)
			{
				for(int b =0;b<12;b++)
				{
					for(int c =0;c<12;c++)
					{
						graph[b][c]=1;
						if(b>0)        graph[b][b-1]=0;
						}
						if(b>=0&&b<11) graph[b][b+1]=0;
					}
			}
			
			
			//第三种类型
			if(a==90||a==270)
			{
				for(int b =0;b<12;b++)
				{
					for(int c =0;c<12;c++)
					{
						if(c==5||c==6) graph[b][c]=0;
						else           graph[b][c]=1;						
					}	
				}
			}
			
			
			//第四种类型
			if(a==135||a==315)
			{
				for(int b =0;b<12;b++)
				{
					for(int c =0;c<12;c++)
					{
						graph[b][c]=1;
					
						if(b>=0&&b<11) graph[b][10-b]=0;
						if(b>0)        graph[b][12-b]=0;		
					}
			}
			}
			
			//打印
			for(int d =0;d<12;d++)
			{
				for(int e =0;e<12;e++)
				{
					System.out.print(graph[d][e]+" ");
				}
				System.out.println();
		    }
			
			
			
		} else System.out.print("Enter the correct Angle!");
		
		//再输入
		Scanner putin2 =new Scanner(System.in);
	    A=putin2.nextLine();
	    
		//以下是“Mode”的判定区块
		if(A.equals(B)) {
			judge = 3 ; //如果是exit，判定为模式3
		}else if(A.equals(N1)||A.equals(N2)||A.equals(N3)||A.equals(N4)||A.equals(N5)||A.equals(N6)||A.equals(N7)||A.equals(N8))
		{ 	judge =1 ;//如果是合法的，判定为可执行的模式1
			a=Integer.parseInt(A);
			//用a来得到我们获取的数字
			}else judge = 2 ; //如果不是以上情况，则是非法需重输入的模式2
		//
		
	    
	}
	
	System.out.print("Over!");
		
}}