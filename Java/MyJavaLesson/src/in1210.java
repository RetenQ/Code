import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class in1210 {

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
			
			
			
			
			
		}


		
	
}
