package notes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lhy07���� {

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
	
	
	
	
//Ƕ��ѭ��(������������̱������)
	//�����⴮������������Ƕ��ѭ��������һ��С��ӡ�����������û�ѡ���ӡ���С����С�ʲôԤ��ͼ��
	Scanner sc = new Scanner(System.in);
	System.out.println("How many rows: ");//�õ�ϣ����ӡ����
	int rows = Integer.parseInt(sc.nextLine());
	System.out.println("How many cols: ");//ϣ��ÿ���ж��ٷ���
	int cols = Integer.parseInt(sc.nextLine());

	char c = '-';
	String ch = new String("");

	do{
		System.out.println("What character would you like to print:");
		ch = sc.nextLine();
		c = ch.charAt(0);
	}while((c !='+') && (c != '*') && (c != '-') && (c!='$'));
	//������Ĳ���+*-$ʱ�����ǽ��ж��ַ��������Ҫ��������д��ʹ����;���һ������

	for(int i = 1; i <= rows; i++)
	{
		for(int j = 1; j <= cols ; j++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	
	System.out.println("�ָ�һ����������");
	
//��ά����2D Arrays
	/*
	 ��������ֽ�����lecture13��PDF������Ȼ��ս�ϵ���ܲ�����⣩
	 ��ά�����д�����£�ע���ά�����������к���(��y��x)������ÿ������ʼ�±궼��0
	       X[][] results= new int[m][n];   ����һ��X���͵����飬����ά�ȵ�������m��n
	 ���� int[][] results= new int[7][5];   ����һ��int���飬����ά�ȵ������ֱ���7��5
	 
	 ��Ӧ�ģ���ֵ����ȡ�� results[0][1];����������Ļ�����results[y][x];
	  
	  ��ά��������
	   int[][] myArray = {{8,1,2,2,9},{1,9,4,0,3},{0,3,0,0,7}}; //ͬʱ��������������
	   ���������У��ֱ���81229��19403��03007				    
	 myArray[2][4] holds the value 7 ���±�Ϊ2���У�ʵ�ʾ��ǵ����У����±�Ϊ4���У�ʵ���ǵ��������7��
     myArray[1][0] holds the value 1
               
            ���ǳ�����Ƕ��ѭ������ɶ�ά����ı����������Ƕ��廹������
		for (int i = 0; i < rows; i++)
	{
		for (int j = 0; j < columns; j++)
		  {
		   board[i][j] = " ";  //board�����[i][j]��" "���ո�
		  }
	}
	 */
	
	//����������������û�����������ӡ���Ӧ���С��У���������������Ȼ�����
	Scanner sc1 = new Scanner(System.in);
	Random rd = new Random();
	System.out.println("How many rows would you like in your array: ");
	int rows1 = sc1.nextInt();
	System.out.println("How many cols would you like in your array: ");
	int cols1 = sc1.nextInt();
	int sum = 0;

	int ar[][] = new int[rows1][cols1];
	//Loop through the array and fill each element with a random number
	//It will then get the sum of all of the elements in the array
	for(int i = 0; i < rows1; i++)
	{
		for(int j = 0; j < cols1 ; j++)
		{
			ar[i][j] = rd.nextInt(201);
			//д���⣬ͻȻ������Ҫȥ��һ��Javaʵ����
			sum += ar[i][j];
		}
	}

	//Print out array
	System.out.println("The contents of the array are: ");
	for(int i = 0; i < rows1; i++)
	{
		for(int j = 0; j < cols1 ; j++)
		{
			System.out.print(ar[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println("The sum of the contents of the array is: " + sum);

	
	/*
	 �õ���ά������г��Ⱥ��г���
	ROWS:    X.length      ����Xһ���ж�����
	COLS:    X[0].length   ����Xһ���ж�����	 �������ʵ���ǵ�һ�У��±�Ϊ0���ĳ����Ƕ��٣������ж����У�
	 */
    
	/*
	 int[][] myArray = new int[5][];//���ǿ����ȶ����м��У������м���
     int[][] myArray = new int[][5];//�Ƿ��ģ�JAVA�й涨�����ȹ涨�У�Ȼ��涨��
     
            ÿһ�е�������Ҳ����ÿһ�е������������ǲ�һ���ġ�
     int myArray[][] = {{3, 4, 5}, {1, 2} };


	  
	 */
	
	
//Java�����ļ����Լ�IO
	//�ǵô���import java.io.*;            ˳��һ�ᣬ*��ʾ�����еĶ����ý���
	//ע�⣬��window���濽����·������\����б���ģ�������д·����ʱ����/����б��
	/* ������
	 
	  //��������ȡ,��BufferedReaderΪ��
	    BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
	    //��������е�·������û�ģ�����Ӧ�ÿ��ó�����·����
	  // �ļ�����ȡ��ָ��һ���ļ�����ȡ
	   ��һ�� InputStream f = new FileInputStream("C:/java/hello");
	    
	   �ڶ���  File f = new File("C:/java/hello");
            InputStream out = new FileInputStream(f);
	    
	    
	    ������Java����
	    public void close() throws IOException{}
		protected void finalize()throws IOException {}
		public int read(int r)throws IOException{}
		public int read(byte[] r) throws IOException{}
		public int available() throws IOException{}
	 
	 */
	
	/*�����
	  ��һ�ַ���
	  OutputStream f = new FileOutputStream("C:/java/hello")
             �ڶ��ַ���
      File f = new File("C:/java/hello");
	  OutputStream f = new FileOutputStream(f);    
	  
	   ���⣬�����д�루�������ʱ�����ָ���ļ������ֲ����ڣ�����Զ��½�һ�����ļ�
	   
	   ������java����
	    public void close() throws IOException{}
		protected void finalize()throws IOException {}
		public void write(int w)throws IOException{}
	 */
	
	//������һ�������ļ�·��Ӱ��ܴ�ʵ������ֱ�ӿ�lecture13��PDF.

	}

}
