package notes;

public class lhy03ѭ����� {

	public static void main(String[] args) {
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
