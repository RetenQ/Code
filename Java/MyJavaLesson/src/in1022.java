
public class in1022 {

	public static void main(String[] args) {
		int n1 = 2 ;
		int n2 = 20 ;
		int result = n1 + n2 ;
		int text = 15 ;
		
		
		System.out.println("10+20="+ result ); //�����ӡָ��
		//��Ҫͬʱ���������ʱ�򣬣���XXXXXX��+ ������
		//��Ҫ�������㣨������ϵ���㣩��ʹ�ã���XXXXXX��+�����㣩��
		
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

	//Ternary Operator ��Ԫ�����  ������Ϊ��if else �ļ�д����1029��

	int alpha = 18,beta = 78;

	int result1 = ((alpha > beta)? alpha:beta) ;
	System.out.println("�����������"+result1 );

	char s = 'd';
	System.out.print("char ����� ������"+s );
	//�ַ���  char ���壬�����õ����� ���� ���롣
	}

}
