import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class in1210 {

	public static void main(String[] args) {
	//1.�������
		//������һ�����ݵļ��ϣ������е����ݺ�����ͬ�����ͣ�����Ĵ�Сȷ��֮�󲻿ɸ�
		//1.��������İ취  M[] X ;  ����һ������X����������M
		int[] myFirstArray; //�Ƽ�д��
		int myFirstArray1[]; //�����д��(����C++�ķ��)
		
		//2.��������һ����С    	X =new int[k];   ����X�Ĵ�С��k
		myFirstArray = new int[5];//����Ĵ�С����Ϊ5
		//ʵ���ϣ�1.2.��������һ����ɵ�
		int[]myFirstArrayA=new int[5];
		
		//3.Ϊ���������ֵ
		myFirstArrayA[0] = 33 ;
		// X[k] = m ; ������X�ĵ�kλ������ֵ��m��
		
		/*�������Ӧ�±�����
		 int [] a = {1,2,3,4,5,6};
		 Index  0 1 2 3 4 5 
		 Value  1 2 3 4 5 6
		 */
		
		
	//2.��ʼ������
		//һ������
		int [] a = {1,2,3,4,5,6}; //��ȷ�ĳ�ʼ����������ͬԪ���ö������֣����������޿ո�Ӱ�죬ֻ������
		/*ͬʱд��һ��д�꣬��Ҫ�����������ֿ�д 
		 int[] myFirstArray = new myFirstArray[5];
         myFirstArray = { 1, 1, 1, 1, 1 };
                 ����д���Ǵ����
		 */
		
		//���ǿ����ó������������飬Java �� ����ֵǰ��final��õ�һ������
		final int MAX = 10;
		int[]array2 = new int[MAX];
		
	    //������[i]�е�i�ǿ���Ϊ�����ҿ�������ѭ���еõ����ı�ı���ֵ
		int[] myFirstArray11 = new int[5];
		for (int i = 0 ; i <= 4 ; i++ )
		{
		myFirstArray11[i] = 1 ;
		}
	//3.����ʹ��
		//1.�����ֵ����ֱ�ӵ���
		int total = 0 ;
		total = myFirstArray[0] + myFirstArray [1] + myFirstArray [2] ;
		//2.�õ�����ĳ���  X.length �õ�����X�ĳ���
		int len =myFirstArray.length; //ע�⣬��������һ����()�����������
		//3.������һ�������Ҳ������ѭ��
		int[] array = new int [5];
		for (int i = 0 ; i < array.length; i++ )
		{
		System.out.println(" Array element " + i + " : " + array[i]);
		} 
		//4.�������������������С������-1������С��0��=ʱ���ᱨ��
		//5.�������û������������ֵ
		    //���û����������еĸ���ֵ�����Ҽ������ǵ�ƽ��ֵ
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter the size of an array: ");
			int len1 = sc.nextInt();
			double ar[] = new double[len1];

			for(int i = 0; i < ar.length ; i++)
			{
				System.out.println("Please enter a double value for position " + i + " :");
				ar[i] = sc.nextDouble();
			}

			System.out.println("The values entered in to the array are: ");

			for(int i = 0; i < ar.length ; i++)
			{
				System.out.print(ar[i] + "\t");
			}
			System.out.println();
			double sum = 0;
			for(int i = 0; i < ar.length ; i++)
			{
				sum += ar[i];
			}
			System.out.println("The sum of all the array values: "+ sum);
			System.out.println("The average of all the array values is: "+ (sum/len1));
			
		//6.����ĸ���
			//1.���븴��
			double array1[] = {17.0,23.4,57.678};
			double array21[] = {22.57,67.2,};
			for(int i = 0; i < array1.length; i++)
			{
			array1[i] = array21[i];//ʵ���Ͼ��ǲ�����ѭ���а�����21��ÿ��λ�ø�ֵ������1 
			}
			//2.Java��������
			  //arraycopy����
			int[] arr1 = { 0, 1, 2, 3, 4, 5 };
			int[] arr2 = { 0, 10, 20, 30, 40, 50 };
			// copies an array from the specified source array
			System.arraycopy(arr1, 0, arr2, 0, 6);
			// System.arraycopy(Դ����, Դ�������ʼλ��int, Ŀ������, Ŀ��������ʼλ��int, Ԫ�ظ���int);
			System.out.print("array2 = ");
			for(int i =0; i<arr2.length; i++)
			{
			System.out.print(arr2[i] + " ");
			}
			  //copyOf����
			double[] arrayOne= { 1.1, 2.2, 3.3, 4.4, 5.5 };
			double[] arrayTwo= Arrays.copyOf(arrayOne,arrayOne.length);
			//Arrays.copyOf(Դ����,���Ƴ���);
			  //clone����
			double[] arrayOne1= { 1.1, 2.2, 3.3, 4.4, 5.5 };
			double[] arrayTwo1= arrayOne1.clone();
			//Դ����.clone();
        //7.���鷽��
			/*
			 Arrays.toString(Arrayname)
             Arrays.sort(Arrayname)
			 Arrays.fill(Arrayname, value_to_fill)
			 Arrays.equals(Array1, Array2)
			 Arrays.binarySearch(Arrayname,value_to_search)
			 */


			
			
			
			//���������������ȴ���import java.util.Random;��
			Random randomGenerator = new Random() ;
			int randomInt = randomGenerator.nextInt(11);//��0-10��������������
			//
			//�÷���������������һ�������intֵ����ֵ����[0,n)�����䣬Ҳ����0��n֮������intֵ������0��������n
			
	//i++��++i�Ĳ�ͬ  ��--ͬ��
			int i = 5;
			int a1 = i++; // a1 = 5, i = 6  �Ƚ�����a1�ĸ�ֵ��Ȼ��i++
			System.out.println(a1);
			int b = ++a1; // b = 6, a = 6   �Ƚ�����a1��++��Ȼ��ֵ
			System.out.println(b); 
			
			
			
			
			
		}


		
	
}
