import java.util.Random;
import java.util.Scanner;

public class in1217 {

	public static void main(String[] args) {
		
	//嵌套循环(类似于汽车里程表的那种)
		//下面这串代码利用这种嵌套循环制作了一个小打印器，可以让用户选择打印几行、几列、什么预设图案
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows: ");//得到希望打印几行
		int rows = Integer.parseInt(sc.nextLine());
		System.out.println("How many cols: ");//希望每行有多少符号
		int cols = Integer.parseInt(sc.nextLine());

		char c = '-';
		String ch = new String("");

		do{
			System.out.println("What character would you like to print:");
			ch = sc.nextLine();
			c = ch.charAt(0);
		}while((c !='+') && (c != '*') && (c != '-') && (c!='$'));
		//当输入的不是+*-$时，我们进行对字符串输入的要求。这样的写法使输入和纠错一起解决了

		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= cols ; j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		
		System.out.println("分割一下两个部分");
		
	//二维数组2D Arrays
		/*
		 （这个部分建议结合lecture13的PDF看，不然虚空建系可能不好理解）
		 二维数组的写法如下，注意二维数组总是先行后列(先y后x)，而且每个的起始下标都是0
		       X[][] results= new int[m][n];   创建一个X类型的数组，两个维度的容量是m和n
		 比如 int[][] results= new int[7][5];   创建一个int数组，两个维度的容量分别是7和5
		 
		 相应的，数值的提取是 results[0][1];更形象的理解的话就是results[y][x];
		  
		  二维数组声明
		   int[][] myArray = {{8,1,2,2,9},{1,9,4,0,3},{0,3,0,0,7}}; //同时声明容量和内容
		   声明了三行，分别是81229，19403，03007				    
		 myArray[2][4] holds the value 7 （下标为2的行（实质就是第三行）的下标为4的列（实质是第五个）是7）
         myArray[1][0] holds the value 1
                   
                我们常利用嵌套循环来完成二维数组的遍历，无论是定义还是搜索
			for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			  {
			   board[i][j] = " ";  //board数组的[i][j]是" "（空格）
			  }
		}
		 */
		
		//下面这个程序会根据用户的输入来打印相对应的行、列，并且随机填充数字然后求和
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
				//写到这，突然想起来要去查一下Java实例化
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
		 得到二维数组的行长度和列长度
		ROWS:    X.length      数组X一共有多少行
		COLS:    X[0].length   数组X一共有多少列	 （这个的实质是第一行（下标为0）的长度是多少，就是有多少列）
		 */
	    
		/*
		 int[][] myArray = new int[5][];//我们可以先定下有几行，不定有几列
         int[][] myArray = new int[][5];//非法的，JAVA中规定必须先规定行，然后规定列
         
                每一行的列数，也就是每一行的列数，可以是不一样的。
         int myArray[][] = {{3, 4, 5}, {1, 2} };


		  
		 */
		
		
	//Java流，文件，以及IO
		//记得打上import java.io.*;            顺便一提，*表示把所有的都调用进来
		//注意，在window里面拷贝的路径，是\（右斜）的，而我们写路径的时候是/（左斜）
		/* 输入流
		 
		  //缓冲区读取,以BufferedReader为例
		    BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
		    //下面代码中的路径都还没改，不过应该看得出来是路径。
		  // 文件区读取，指定一个文件被读取
		   第一种 InputStream f = new FileInputStream("C:/java/hello");
		    
		   第二种  File f = new File("C:/java/hello");
                InputStream out = new FileInputStream(f);
		    
		    
		    有以下Java方法
		    public void close() throws IOException{}
			protected void finalize()throws IOException {}
			public int read(int r)throws IOException{}
			public int read(byte[] r) throws IOException{}
			public int available() throws IOException{}
		 
		 */
		
		/*输出流
		  第一种方法
		  OutputStream f = new FileOutputStream("C:/java/hello")
                 第二种方法
          File f = new File("C:/java/hello");
		  OutputStream f = new FileOutputStream(f);    
		  
		   另外，如果在写入（输出）的时候，如果指定文件的名字不存在，则会自动新建一个该文件
		   
		   有以下java方法
		    public void close() throws IOException{}
			protected void finalize()throws IOException {}
			public void write(int w)throws IOException{}
		 */
		
		//由于这一部分受文件路径影响很大，实例代码直接看lecture13的PDF.
		
	}
}
