package lab9work;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		
	int[][] graph =new int [12][12];//���������������
	
	String B=new String ("exit");//exit�ַ������ж��˳�
	
	//����Ÿ��ַ��������ж��Ƿ��ǺϷ������룬�����������a=Integer.parseInt(A);�ı���
	String N1=new String ("0");
	String N2=new String ("180");
	String N3=new String ("360");
	String N4=new String ("45");
	String N5=new String ("225");
	String N6=new String ("90");
	String N7=new String ("270");
	String N8=new String ("135");
	String N9=new String ("315");
	
	int judge = 0;//����ѡ��mode
	int a = 2 ;
	
	Scanner putin =new Scanner(System.in);
	String A=putin.nextLine();
	
	//�����ǡ�Mode�����ж�����
	if(A.equals(B)) {
		judge = 3 ; //�����exit���ж�Ϊģʽ3
	}else if(A.equals(N1)||A.equals(N2)||A.equals(N3)||A.equals(N4)||A.equals(N5)||A.equals(N6)||A.equals(N7)||A.equals(N8))
	{ 	judge =1 ;//����ǺϷ��ģ��ж�Ϊ��ִ�е�ģʽ1
		a=Integer.parseInt(A);
		//��a���õ����ǻ�ȡ������
		}else judge = 2 ; //�������������������ǷǷ����������ģʽ2
	//
	
	
	while(judge == 1 || judge == 2 ) {
		//����ģʽ1 2��ʱ�򣬽���ѭ���� ����ģʽ3ʱ��Ż��˳�
		if(judge ==1) {
			//����ǺϷ������� 0 180 360 45 225 90 270 135 315 
			
			//��һ������	
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
			
			
			//�ڶ�������
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
			
			
			//����������
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
			
			
			//����������
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
			
			//��ӡ
			for(int d =0;d<12;d++)
			{
				for(int e =0;e<12;e++)
				{
					System.out.print(graph[d][e]+" ");
				}
				System.out.println();
		    }
			
			
			
		} else System.out.print("Enter the correct Angle!");
		
		//������
		Scanner putin2 =new Scanner(System.in);
	    A=putin2.nextLine();
	    
		//�����ǡ�Mode�����ж�����
		if(A.equals(B)) {
			judge = 3 ; //�����exit���ж�Ϊģʽ3
		}else if(A.equals(N1)||A.equals(N2)||A.equals(N3)||A.equals(N4)||A.equals(N5)||A.equals(N6)||A.equals(N7)||A.equals(N8))
		{ 	judge =1 ;//����ǺϷ��ģ��ж�Ϊ��ִ�е�ģʽ1
			a=Integer.parseInt(A);
			//��a���õ����ǻ�ȡ������
			}else judge = 2 ; //�������������������ǷǷ����������ģʽ2
		//
		
	    
	}
	
	System.out.print("Over!");
		
}}