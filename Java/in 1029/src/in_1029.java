
public class in_1029 {
//�ʼ�������
	public static void main(String[] args) {
//1.
		int a = -100, b = 20;
	    //��Ԫ�����  
		int min = (a < b) ? a : b;
		// (���������)? �ж���ȷ����� : �жϴ������� ;
		
		System.out.println("Minimum value is: " + min);
		
		int max = (a > b) ? a : b;
		System.out.println("Maximum value is: " + max);
		int abs = (a < 0) ? -a : a;
		System.out.println("Absolute value is: " + abs);
//2.
		double number1 = -15.5, number2 = 10.2, sum = 0.0;
		sum = number1 - number2;
	    char result = '-';

	    result = (sum > 0.0) ? '+' : '-';
	    System.out.println("sum is " + result);
	    
//3.
	    int month = 24;
	    int numDays= 0;
	    switch (month)
	    {case 1: case 3: case 5: case 7: case 8: case 10:
	    case 12: numDays= 31; 
	    
	    //���� 1 3 5 7 8 10 �������һ�ɽ� numDay ��ֵΪ31
	    break;
	    case 4: case 6: case 9: case 11: numDays= 30;
	    break;
	    case 2: numDays= 28; 
	    break;
	    //���� 4 6 9 11  �������һ�ɽ� numDay ��ֵΪ31, 2Ϊ 28.

	    default:
	    System.out.println("Invalid month.");
	    //�趨Ĭ�ϵ�������ǳ�������case��Ϊ�������
	    }
	    
	    System.out.println("Number of Days = " + numDays);
	    //Switch-case ���  �﷨Ӧ�ú�C��һ����


//4.
		int num = 77;
		if(num/10 < num%10)
		{
			System.out.println("Ascending Order");
		}
		else if(num/10 > num%10)
		{
			System.out.println("Descending Order");
		}
		else
		{
			System.out.println("Equivalent Order");
		}
//if-else ��� ������else if



		

// L O O P !

//1.
int count1 = 13;
while ( count1 <= 20 )
{
System.out.println("Count is: " + count1 );
count1 ++;

}
/*
 while (����)
 {
       ѭ����������; ......
   ...
   һ����Ҫ����һ��������ı��ж�ֵ�����������ѭ���������������ΪUpdate��
   
   *  Java��whileд����C��һ���ġ�      
 }
 */
System.out.println("Count was "+count1 + "  when the condition become false");



//2.for ѭ��

	
	/*
	 for(��ʼ��ֵ(����ѭ��ǰִ�е�);ִ������ ; update���²���){
	 
	 
	 ���.........
	 }
	 */
int num1 = 5, sigma = 0;
for(int i = 1; i <= num1; i++) {
	sigma += i;
	System.out.println("This time it is "+sigma );

}
System.out.println("The sigma of " + num1 + " is " + sigma);

//3. do-while
/* 
 ��ʼֵ
 do{
 ���;
 ���²���
 }while (����);
 
 
 ��������һ��ѭ��֮����ȥ�����������ȥ�ж��Ƿ����ִ��������  
 
 *�﷨�� C ��ͬ��
 
 */


//Constant ��������   �������ֵ���ᱻ�ı�
final double PI = 3.14159 ; //���ﶨ����double���� PI�����������һ��������������ı䡣
System.out.println("PI is " + PI);


	}

	

}
