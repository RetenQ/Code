package lecture11;
import java.util.Scanner;
public class decToBin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//�ü���������Ӧ����
		
		System.out.println("Please enter a number to convert to binary:");
		//����һ��Ҫת����2���Ƶ�10����
		
		
		String number = new String("");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("Num: " + num);
		while(num > 0)
		{
			number = num%2 + number;//�ۼ�����

			num = num/2;//���ó�������õ���������
		}
		System.out.println("Binary number: " + number);
	}
}