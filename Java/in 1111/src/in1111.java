
public class in1111 {

	public static void main(String[] args) {
		//1.�����
/*
 ��ϵ����� �� ==     !=     >     <     >=     <=    ��������boolean
���������  ��&��     |��    ^ ���    &&��·��       ||��·��    ! �߼���
�����ıȽϻ�����������ʼ�������Ҫ��¼��  ��·��   ��·��   
 */

		//��·�� && ����һ������ΪTrue���Ż�ȥ�ж���������������⣬�������ж��Ǻͱ��ʽ����ͬʱ���е�
		int x = 4; 
		if(x>3 && x++<6) {//���x>3��ͨ��������x����+1��С��6
			System.out.println(x+"���ǿ��Է���x++�����Ǳ����е�"); //���ǿ��Է���x++�����Ǳ����е�		
		}
		int y = 4;
		if(x>4 && x++<6) {
			System.out.println("������ѭ��������y="+y);		
		}
		else System.out.println("û�н�����ѭ��������y="+y);
		//��һ�������㲻�����ˣ�����y++������û�б�����		
	
	
	     //2.�������ͼ���ת��
/* 
  ����������С�������������
  byte short int long ��Щ��������   ��С����
  float double        ��Щ�Ǻ�С����  Ҳ����С���� 
  ��Ȼ��С�����ת���ǿ��Եģ����Ǵ�תС�п��ܵ������ݺ;��ȵĶ�ʧ		
  ����֮����x = B����ת��*/
		
		int a = 3 ;
		long a1=a;
		float a2 =a;
		System.out.println("a="+a);
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
  
  /*�ô���ת��������
   Integer.toString(<int>)
   Byte.toString(<byte>) 
   Short.toString(<short>) 
   Float.toString(<float>) 
   Boolean.toString(<Boolean>)
   
   
   String.valueOf(<long>) // return a string that is conversion result from long type
   String.valueOf(<double>) // return a string that is conversion result from double type
   Character.toString(<char>) or <char> + "" // // return a string that is conversion result from character
 */
		 
//����������int����ת��charʱ����õ�һ����Ӧ�� ASCIIֵ. ��double,float,longʱͬ��	
		int b ='b';
		System.out.println("int b = 'b'��õ�"+b);
		
//�����ķ����������ã���������intת����char��Ӧ���ַ�
		int c =333;
		char c1 = (char)c;
		System.out.println("c1="+c1);
/* ͬ�����漸��д��Ҳ�Ǻ����
   
    (byte)<double>/<float>/<long>
    (float)<double>/<float>/<long>
    (char)<integer>

 
 
 */
		
		
	}

}
