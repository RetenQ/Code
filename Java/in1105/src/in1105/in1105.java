package in1105;

public class in1105 {
//�ʼ�������
	public static void main(String[] args) {
		
//1. String ���ַ����� �Ĵ�����ʹ�ã�String methods��		
		
		
		//1
		String a ;
		a = "Hello World ";
		System.out.println(a);
		
		//2  �Ƽ�ʹ���������д��
		String b = new String ("Hi");//���д����ǿ������һ���µ�ַ�����������
		
		System.out.println(b);
		
		System.out.println("b"+b); // b������ǰ�涨���String��
		
		//3
		String c = "Yes"; //����������д����һ����
		//  c = "C";  //�����ٸ�ֵ������
		System.out.println(c);
		
		/* �ַ���String �ǲ��ɱ�Ķ���immutable����������String methodsʱ��������һ��
		    �����ַ�������ı���Ӧ���ǿ����ٸ�ֵ�ġ� */
		
		
		//4
		String e = new String("");
		e = a+"."+b+"."+c; 
		System.out.println(e);

		
        char s = 'S';
		System.out.println("char ����� ������"+ s ); //char �������һ���ַ������� '  ������ ' ����
		
		// A String is a sequence of character,character is simple.

       //  JAVA API for Strings : docs.oracle.com/javase/7/docs/api/java/lang/String.html

//2. String methods
		String s1 = new String("Hello World");
		
		// <X> . toLowerCase()   ��X��ΪСд
		System.out.println("s1 in lowercase: " + s1.toLowerCase()); 
		System.out.println("s1 now: " + s1); 
		
		// <X> . toUpperCase()   ��X��ΪСд
		System.out.println("s1 in uppercase: " + s1.toUpperCase());//��д
		System.out.println("s1 now: " + s1); 
		//ע�⣬�����������s1�ǲ���ģ�Hello World��������String methods����ı�s1������
	
		String s3 = new String("abcdefghi"); 
		
		
		//<X>.length()  �õ��ַ���X�ĳ���
		int length = s3.length();
		System.out.println("�ַ���"+s3+"�ĳ�����"+length);
		
		//<X>.charAt(Y) �����  �ַ��� X�еĵڣ�Y�����ַ���ע�������Ǵ�0��ʼ
		char firstChar = s3.charAt(0); 				
		System.out.println("�ַ���" + s3 + " �ĵ�һ���ַ� " + firstChar);
		
		char thirdChar = s3.charAt(4); 				
		System.out.println("�ַ���" + s3 + " �ĵ������ַ� " + thirdChar);
		
		
		char lastChar = s3.charAt(s3.length()-1);//����-1��Ȼ�����һ������Ϊ��һ����0 
		System.out.println("�ַ���" + s3 + " �����һ���ַ��� " + lastChar);
		
		//������������ֿ���������Ҳ�����Ǳ���
		String s11 = new String("Hello this is a Cs161 lecture");
		for(int i = 0; i < s11.length() ; i++) { 
			
			System.out.println(s11.charAt(i)); 
			}	
			
		//<X>.replace('a','b'); ���ַ���X�У���b����a
		String ceshi = "Before";
		System.out.println(ceshi); 
		ceshi = ceshi.replace('o' , '*');//��*�����ַ����е�o
		System.out.println(ceshi); 
	
		
		//<X>.IndexOf(Y)  �õ��ַ����е�һ�γ����ַ�Y��λ������
		int index = ceshi.indexOf('B') ; //�õ��ַ���ceshi�е�һ������B��λ�ã�ע�����������
		System.out.println("�ַ���Before�е�һ�γ���B��λ��������  "+index); //B�ǵ�һ����λ��������0

		//<X>.equals��<Y>��  ���ַ���X��Y�Ƿ���Ƚ���һ��bool�ж�
		String s111 = new String("Hello world"), s112 = new String("Hello World");
			if(s111.equals(s112)) { //String�ַ��������ݵ������equals�жϣ�
				System.out.println("�ַ���s111"+s111+"���ַ���s112"+s112+"����ȫ��ͬ��");
				} else { System.out.println("��ͬ");} 
			
			
		/*  == ���Ƚ������ַ����Ĵ洢��Ԫ��ַ�Ƿ�����ͬ��	
		    <X>.compareTo(<Y>)  ����Number �� ��XY���бȽϣ�������0��X�����1��XС���-1
		    Strings֮��ıȽ��ƺ������ӣ������֮�󲹳䡣
		      ���䣺
		      ����˼�룺String ���ַ���,���ıȽ���compareTo����,���ӵ�һλ��ʼ�Ƚ�, 
		                      ���������ͬ���ַ�,�����Ϸ����������ַ���asciiֵ��ֵ.����ֵ��int����
		    1.�������Ƚϵ��ַ�����Ӣ���ҳ��Ȳ���ʱ��
			  1�����ȶ̵��볤�ȳ����ַ�һ�����򷵻صĽ�����������������ֵ	
			  2)���Ȳ�һ����ǰ�����ַ�Ҳ��һ��,�ӵ�һλ��ʼ�ң�
			       ���ҵ���һ�����ַ�ʱ���򷵻ص�ֵ���������ַ��Ƚϵ�ֵ
		
			2.�������Ƚϵ��ַ�����Ӣ���ҳ������ʱ��
			 1)һ���ַ�
			 2������ַ�,��һ���ַ���ͬ��ֱ�ӱȽϵ�һ���ַ�
			 3������ַ�,��һ���ַ���ͬ��ֱ�ӱȽϵڶ����ַ�,�Դ�����
		 */
			
			
			
		/*�������ַ���
		 <X>.substring (<int1>,<int2>)  ��ȡ�ַ���X��int1����int2 - 1��֮����ַ��������ַ���
		 <X>.substring (<int3>)         ���ַ���X�ĵ�int3λ��ȡ����β 	
		*/
			
		String X1 = new String ("0123456789");
		String X1_1 = X1.substring (1,5);
		String X1_2 = X1.substring (4);
		System.out.println("�ַ���X1"+X1+"���������ַ�����"+X1_1+"\n"+"��"+X1_2);
		
		
		/*���������ַ���
		  �������ǿ�����+����
		 ����<X>.concat(<Y>) ����XY�����ַ���
		 */

		String c0 = new String("hello");
		System.out.println("c0:  "+c0);
		String c1 = new String(c0+"world");
		System.out.println("c1:  "+c1);
		String c2 = new String(c0+c1);
		System.out.println("c2:  "+c2);

		
		String c01 = c0.concat(c1);
		System.out.println("c0��c1����֮��ɵ� :  "+c01);
		//����������String c2 = new String(c0+c1);��ͬ
			
		}
		

}
