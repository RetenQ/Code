import java.util.Random;
import java.util.Scanner;

public class in1217 {

	public static void main(String[] args) {
		
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
