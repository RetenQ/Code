package lab9work;
import java.util.Scanner;
public class task1Copy {

		public static void main(String[] args) {
			
			Scanner putin =new Scanner(System.in);
			int[][] s=new int [12][12];
			String A=putin.nextLine();
			//��A����ȡputin��õ��ַ���Ϊ����ת����������׼����
			
			String B="exit";
			
			while(true)
			{
			if(A.equals(B))
			{	
				System.exit(0);
			}
			else
			
			{
				
				int a=Integer.parseInt(A);
				//��a���õ����ǻ�ȡ������
				
				if(a==0||a==180||a==360||a==45||a==225||a==90||a==270||a==135||a==315)
				{
					
				//��һ������	
				if(a==0||a==180||a==360)
				{
					for(int b =0;b<12;b++)
					{
						for(int c =0;c<12;c++)
						{
							if(b==5||b==6)
							{
								s[b][c]=0;
							}
							else
							{
								s[b][c]=1;
							}
							
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
							s[b][c]=1;
							if(b>0)
							{
								s[b][b-1]=0;
							}
							if(b>=0&&b<11)
							{
								s[b][b+1]=0;
							}
						}
				}
				}
				
				
				//����������
				if(a==90||a==270)
				{
					for(int b =0;b<12;b++)
					{
						for(int c =0;c<12;c++)
						{
							if(c==5||c==6)
							{
								s[b][c]=0;
							}
							else
							{
								s[b][c]=1;
							}
							
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
							s[b][c]=1;
						
							if(b>=0&&b<11)
							{
								s[b][10-b]=0;
							}
							if(b>0)
							{
								s[b][12-b]=0;
							}
								
						}
				}
				}
				
				}
				else
				{
					System.out.println("Restart the program and enter the correct Angle");
					break;
				}
				
				//��ӡ
				for(int d =0;d<12;d++)
				{
					for(int e =0;e<12;e++)
					{
						System.out.print(s[d][e]+" ");
					}
					System.out.println();
			    }
				
			}
			A=putin.nextLine();
		}
		}

}
