package in1105;

public class in1105 {
//笔记已整合
	public static void main(String[] args) {
		
//1. String （字符串） 的创建和使用（String methods）		
		
		
		//1
		String a ;
		a = "Hello World ";
		System.out.println(a);
		
		//2  推荐使用下面这个写法
		String b = new String ("Hi");//这个写法会强行增加一个新地址，区别见后文
		
		System.out.println(b);
		
		System.out.println("b"+b); // b是我们前面定义的String。
		
		//3
		String c = "Yes"; //定义其他的写法是一样的
		//  c = "C";  //定义再赋值测试行
		System.out.println(c);
		
		/* 字符串String 是不可变的对象（immutable），在讨论String methods时在讨论这一点
		    但是字符串定义的变量应该是可以再赋值的。 */
		
		
		//4
		String e = new String("");
		e = a+"."+b+"."+c; 
		System.out.println(e);

		
        char s = 'S';
		System.out.println("char 定义的 文字是"+ s ); //char 定义的是一个字符，且用 '  单引号 ' 定义
		
		// A String is a sequence of character,character is simple.

       //  JAVA API for Strings : docs.oracle.com/javase/7/docs/api/java/lang/String.html

//2. String methods
		String s1 = new String("Hello World");
		
		// <X> . toLowerCase()   将X变为小写
		System.out.println("s1 in lowercase: " + s1.toLowerCase()); 
		System.out.println("s1 now: " + s1); 
		
		// <X> . toUpperCase()   将X变为小写
		System.out.println("s1 in uppercase: " + s1.toUpperCase());//大写
		System.out.println("s1 now: " + s1); 
		//注意，在这个过程中s1是不变的（Hello World），调用String methods不会改变s1的内容
	
		String s3 = new String("abcdefghi"); 
		
		
		//<X>.length()  得到字符串X的长度
		int length = s3.length();
		System.out.println("字符串"+s3+"的长度是"+length);
		
		//<X>.charAt(Y) 会调出  字符串 X中的第（Y）个字符，注意排序是从0开始
		char firstChar = s3.charAt(0); 				
		System.out.println("字符串" + s3 + " 的第一个字符 " + firstChar);
		
		char thirdChar = s3.charAt(4); 				
		System.out.println("字符串" + s3 + " 的第三个字符 " + thirdChar);
		
		
		char lastChar = s3.charAt(s3.length()-1);//长度-1自然是最后一个，因为第一个是0 
		System.out.println("字符串" + s3 + " 的最后一个字符是 " + lastChar);
		
		//括号里（）的数字可以是数，也可以是变量
		String s11 = new String("Hello this is a Cs161 lecture");
		for(int i = 0; i < s11.length() ; i++) { 
			
			System.out.println(s11.charAt(i)); 
			}	
			
		//<X>.replace('a','b'); 再字符串X中，用b代替a
		String ceshi = "Before";
		System.out.println(ceshi); 
		ceshi = ceshi.replace('o' , '*');//用*代替字符串中的o
		System.out.println(ceshi); 
	
		
		//<X>.IndexOf(Y)  得到字符串中第一次出现字符Y的位置索引
		int index = ceshi.indexOf('B') ; //得到字符串ceshi中第一个出现B的位置，注意这个是整型
		System.out.println("字符串Before中第一次出现B的位置索引是  "+index); //B是第一个，位置索引是0

		//<X>.equals（<Y>）  对字符串X、Y是否相等进行一次bool判断
		String s111 = new String("Hello world"), s112 = new String("Hello World");
			if(s111.equals(s112)) { //String字符串的内容的相等用equals判断）
				System.out.println("字符串s111"+s111+"和字符串s112"+s112+"是完全相同的");
				} else { System.out.println("不同");} 
			
			
		/*  == ：比较两个字符串的存储单元地址是否是相同的	
		    <X>.compareTo(<Y>)  用于Number ： 对XY进行比较，相等输出0，X大输出1，X小输出-1
		    Strings之间的比较似乎更复杂，这里待之后补充。
		      补充：
		      中心思想：String 是字符串,它的比较用compareTo方法,它从第一位开始比较, 
		                      如果遇到不同的字符,则马上返回这两个字符的ascii值差值.返回值是int类型
		    1.当两个比较的字符串是英文且长度不等时，
			  1）长度短的与长度长的字符一样，则返回的结果是两个长度相减的值	
			  2)长度不一样且前几个字符也不一样,从第一位开始找，
			       当找到不一样的字符时，则返回的值是这两个字符比较的值
		
			2.当两个比较的字符串是英文且长度相等时，
			 1)一个字符
			 2）多个字符,第一个字符不同则直接比较第一个字符
			 3）多个字符,第一个字符相同则直接比较第二个字符,以此类推
		 */
			
			
			
		/*生成子字符串
		 <X>.substring (<int1>,<int2>)  截取字符串X中int1到（int2 - 1）之间的字符生成子字符串
		 <X>.substring (<int3>)         从字符串X的第int3位截取至结尾 	
		*/
			
		String X1 = new String ("0123456789");
		String X1_1 = X1.substring (1,5);
		String X1_2 = X1.substring (4);
		System.out.println("字符串X1"+X1+"的两个子字符串是"+X1_1+"\n"+"和"+X1_2);
		
		
		/*连接两个字符串
		  首先我们可以用+连接
		 或者<X>.concat(<Y>) 连接XY两个字符串
		 */

		String c0 = new String("hello");
		System.out.println("c0:  "+c0);
		String c1 = new String(c0+"world");
		System.out.println("c1:  "+c1);
		String c2 = new String(c0+c1);
		System.out.println("c2:  "+c2);

		
		String c01 = c0.concat(c1);
		System.out.println("c0和c1连接之后可得 :  "+c01);
		//结果和上面的String c2 = new String(c0+c1);相同
			
		}
		

}
