package notes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lhy07数组 {

	public static void main(String[] args) {
//1.数组初步
//数组是一组数据的集合，数组中的数据含有相同的类型，数组的大小确定之后不可改
//1.声明数组的办法  M[] X ;  创建一个数组X，其类型是M
int[] myFirstArray; //推荐写法
int myFirstArray1[]; //另外的写法(这是C++的风格)

//2.给予数组一个大小    	X =new int[k];   数组X的大小是k
myFirstArray = new int[5];//数组的大小被设为5
//实际上，1.2.两步可以一步完成的
int[]myFirstArrayA=new int[5];

//3.为数组添加数值
myFirstArrayA[0] = 33 ;
// X[k] = m ; 在数组X的第k位，其数值是m、

/*数组与对应下标索引
 int [] a = {1,2,3,4,5,6};
 Index  0 1 2 3 4 5 
 Value  1 2 3 4 5 6
 */


//2.初始化数组
//一步就绪
int [] a = {1,2,3,4,5,6}; //正确的初始化方法，不同元素用逗号区分，逗号中有无空格不影响，只认数字
/*同时写就一次写完，不要像下面这样分开写 
 int[] myFirstArray = new myFirstArray[5];
 myFirstArray = { 1, 1, 1, 1, 1 };
         这种写法是错误的
 */

//我们可以用常量来设置数组，Java 中 在数值前加final会得到一个常量
final int MAX = 10;
int[]array2 = new int[MAX];

//数组中[i]中的i是可以为变量且可以是在循环中得到并改变的变量值
int[] myFirstArray11 = new int[5];
for (int i = 0 ; i <= 4 ; i++ )
{
myFirstArray11[i] = 1 ;
}
//3.数组使用
//1.数组的值可以直接调用
int total = 0 ;
total = myFirstArray[0] + myFirstArray [1] + myFirstArray [2] ;
//2.得到数组的长度  X.length 得到数组X的长度
int len =myFirstArray.length; //注意，其他方法一般有()但是这个不用
//3.和声明一样，输出也可以用循环
int[] array = new int [5];
for (int i = 0 ; i < array.length; i++ )
{
System.out.println(" Array element " + i + " : " + array[i]);
} 
//4.当访问索引超出数组大小（长度-1）或者小于0是=时，会报错
//5.可以让用户输入数组的数值
    //让用户输入数组中的各个值，并且计算它们的平均值
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
	
//6.数组的复制
	//1.代码复制
	double array1[] = {17.0,23.4,57.678};
	double array21[] = {22.57,67.2,};
	for(int i = 0; i < array1.length; i++)
	{
	array1[i] = array21[i];//实质上就是不断在循环中把数组21的每个位置赋值给数组1 
	}
	//2.Java方法复制
	  //arraycopy方法
	int[] arr1 = { 0, 1, 2, 3, 4, 5 };
	int[] arr2 = { 0, 10, 20, 30, 40, 50 };
	// copies an array from the specified source array
	System.arraycopy(arr1, 0, arr2, 0, 6);
	// System.arraycopy(源数组, 源数组的起始位置int, 目标数组, 目标数组起始位置int, 元素个数int);
	System.out.print("array2 = ");
	for(int i =0; i<arr2.length; i++)
	{
	System.out.print(arr2[i] + " ");
	}
	  //copyOf方法
	double[] arrayOne= { 1.1, 2.2, 3.3, 4.4, 5.5 };
	double[] arrayTwo= Arrays.copyOf(arrayOne,arrayOne.length);
	//Arrays.copyOf(源数组,复制长度);
	  //clone方法
	double[] arrayOne1= { 1.1, 2.2, 3.3, 4.4, 5.5 };
	double[] arrayTwo1= arrayOne1.clone();
	//源数组.clone();
//7.数组方法
	/*
	 Arrays.toString(Arrayname)
     Arrays.sort(Arrayname)
	 Arrays.fill(Arrayname, value_to_fill)
	 Arrays.equals(Array1, Array2)
	 Arrays.binarySearch(Arrayname,value_to_search)
	 */


	
	
	
	//附：获得随机数（先打上import java.util.Random;）
	Random randomGenerator = new Random() ;
	int randomInt = randomGenerator.nextInt(11);//在0-10间随机产生随机数
	//
	//该方法的作用是生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
	
//i++和++i的不同  （--同理）
	int i = 5;
	int a1 = i++; // a1 = 5, i = 6  先进行了a1的赋值，然后i++
	System.out.println(a1);
	int b = ++a1; // b = 6, a = 6   先进行了a1的++，然后赋值
	System.out.println(b); 
	
	
	
	
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
