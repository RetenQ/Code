package notes;

public class lhy02������� {

	public static void main(String[] args) {
		int n1 = 2 ;
		int n2 = 20 ;
		int result = n1 + n2 ;
		int text = 15 ;
		if(n1 == 10)
		{
			
			System.out.println("OK!");
			
		}
		
		else
		{
			
			System.out.println("NO!");
		}
		//�������ģ��
//		�������if��������һ����������ֻ����if�б���ʹ�á�
		
		int a = 0;
		System.out.println("����ifǰ��a "+a);
		
		if(a==0) {
		 int b=10;
		System.out.println("������if���ɵ����"+b);
		//if��������һ��b�������bֻ����if�����ʹ�á�
		} 
		
		//Ƕ����������д����C.���
		
		System.out.println("Over ");

	  
	if (text<10) {
		
		System.out.println("TEXT<10!");
		
	}

	else if (text>20)
	{
	System.out.println("Text>20!");	
	}
	else
	{
	System.out.println("Text>20,But it >10 !");	
	}



	//����ϵ������ȷʱ�������Ture,��������Flase����Ҳ��֪������Ǳ�C �������Ǳ�C ���� 
	//����������C���в��Եģ������ϻ�û��������˵û��ϸ����һ�飬�������÷��ͽ��ۿ���������Ȼ�����������


	System.out.println("����һ�����ڹ�ϵ������Ĳ��� ��  "+(10<1) );



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
	
	


	//Switch��䣬�����ڶ������ж�
	/*
	 switch(variableName)
	 {
	 case <val1>:���  ;break;  (break����ɹ����������ܲ��ܲ��Ӷ����жϳɹ������ִ��Switch?)
	 case <val2>:���  ;break;
	 default:���;
	 
	 }
	 */

	int t =4 ;
	switch(t) {
	case 1:System.out.print("����һ");break;
	case 2:System.out.print("���ڶ�");break;
	case 3:System.out.print("������");break;
	case 4:System.out.print("������");break;
	case 5:System.out.print("������");break;
	case 6:System.out.print("������");break;
	case 7:System.out.print("������");break;
	default:System.out.print("����");
	}
	
	
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
	
	
	

	//Ternary Operator ��Ԫ�����  ������Ϊ��if else �ļ�д����1029��

	int alpha = 18,beta = 78;

	int result1 = ((alpha > beta)? alpha:beta) ;
	System.out.println("�����������"+result1 );

	
	int a1 = -100, b = 20;
    //��Ԫ�����  
	int min = (a1 < b) ? a1 : b;
	/*д����
	 *  (���������)? �ж���ȷ����� : �жϴ������� ;
	*/
	
	System.out.println("Minimum value is: " + min);
	
	int max = (a1 > b) ? a1 : b;
	System.out.println("Maximum value is: " + max);
	int abs = (a1 < 0) ? -a1 : a1;
	System.out.println("Absolute value is: " + abs);
	}
}
	

