import java.util.Scanner;

public class in1203 {

	public static void main(String[] args) {
/*�ڴӲ����ҵ��������ϵͳ�У�����1202���䶨λ (λȨ) ����
  4 2 0 2
  3 2 1 0      */ 
		
	//ʮת��
		System.out.println("ʮת��" );

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
		
	//��תʮ	
		System.out.println(" " );
		System.out.println("��תʮ" );

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter a binary number");
		int num1 = Integer.parseInt(sc1.nextLine());

		System.out.println("Your number is: " + num1);
		int position = 0, sum = 0;
		while(num1 > 0)
		{
			if(num1%10 == 1)//�õ���λ�����Ҹ�λ����1��ʱ��ż���
			{
				sum = sum + (int)(Math.pow(2,position));//����1��2��n�η��ļ��㣬�Լ�������ۼ�
				            //(X)(Math.pow(m,n))  m��n�η��Ľ����X����
				// System.out.println("Sum: " + sum);
			}
			position++;
			num1 = num1 / 10;//��ȥ������λ��
		}
		System.out.println("Decimal number: " + sum);
		
	//ʮתʮ��
		System.out.println(" " );
		System.out.println("ʮתʮ��" );
		
		Scanner sc11 = new Scanner(System.in);
		System.out.println("Please enter a decimal number to convert to hex: ");
		int num11 = Integer.parseInt(sc11.nextLine());
		
		String digits = new String("0123456789ABCDEF");//0-F��Ԥ���
		String number1 = new String("");
		int position1 = 0;
		
		while(num11 > 0)
		{
			position1 = num11 % 16; 
			number1 = digits.charAt(position1) + number1; //����pisition1 ȥdigits�еõ���Ӧ����
			num11 = num11 / 16;
		}
		
	System.out.println("Hex: " + number1);
	
	//��תʮ��
	System.out.println(" " );
	System.out.println("��תʮ��" );
	
	Scanner sc111=new Scanner(System.in);
	System.out.println("Please enter a binary number to convert to Hex: ");
	int numBin = sc111.nextInt();
	sc111.close();
	int power = 0, res = 0;

	while(numBin > 0)
	{
		res = res + ((numBin%2)*(int)(Math.pow(2,power))); // extract last digit and add to red
		power++; // increase the power
		numBin = numBin / 10;  // get rid of last digit
	}
	System.out.println("Num in Decimal is: " + res);
	//���ó���Ѷ�����ת��Ϊʮ����
	
	String digits1 = new String("0123456789ABCDEF");
    String number11 = new String("");

    int digit = 0;
    while(res > 0)
	{
		digit = res % 16;
		number11 = digits1.charAt(digit) + number11;
		res = res/16;
	}
    //Ȼ���ٰ�ת���õ�ʮ������ת��Ϊʮ������

    System.out.println(number11);
		
//��������ݴ�PDF �� 62 ҳ��ʼ
	}

}
