package notes;

public class lhy05数据类型以及转化 {

	public static void main(String[] args) {
//1.运算符
	/*
	 关系运算符 ： ==     !=     >     <     >=     <=    输出结果是boolean
	布尔运算符  ：&与     |或    ^ 或非    &&短路与       ||短路或    ! 逻辑非
	其他的比较基础，在这个笔记中我主要记录了  短路与   短路或   
	 */

	//短路与 && 当第一个条件为True，才会去判断下面的条件。另外，条件的判断是和表达式运算同时进行的
	int x = 4; 
	if(x>3 && x++<6) {//如果x>3（通过），且x进行+1后小于6
		System.out.println(x+" 我们可以发现x++运算是被进行的"); //我们可以发现x++运算是被进行的		
	}
	
	System.out.println(" "); 
	
	int y = 4;	
	if(x>4 && x++<6) {
		System.out.println("进入了循环，并且y="+y);		
	}
	else System.out.println("没有进入了循环，并且y="+y);
	//第一个条件便不符合了，所有y++的运算没有被进行		
	System.out.println(" "); 

//2.数据类型及其转换
	/* 
	  数据类型由小到大的排序如下
	  byte short int long   这些是整型类   由小到大
	  float double          这些是含小数的  也是由小到大 
	  显然，小到大的转换是可以的，但是大转小有可能导致数据和精度的丢失		*/
	
	  //可以用x = B进行转化*/	
		int a = 3 ;
		long a1 = a;
		float a2 = a;
		System.out.println("a="+a);
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		
		System.out.println(" "); 

  /*用代码转化，如下
   Integer.toString(<int>)
   Byte.toString(<byte>) 
   Short.toString(<short>) 
   Float.toString(<float>) 
   Boolean.toString(<Boolean>)
   
   
   String.valueOf(<long>) // return a string that is conversion result from long type
   String.valueOf(<double>) // return a string that is conversion result from double type
   Character.toString(<char>) or <char> + "" // // return a string that is conversion result from character
 */
		 
//当进行利用int定义转化char时，会得到一个对应的 ASCII值. 将double,float,long时同理	
		int b ='b';
		System.out.println("int b = 'b'会得到"+b);
		System.out.println(" "); 

//上述的方法可以逆用，比如输入int转化成char对应的字符
		int c =333;
		char c1 = (char)c;
		System.out.println("c1="+c1);
		System.out.println(" "); 

/* 同理，下面几个写法也是合理的
   
    (byte)<double>/<float>/<long>
    (float)<double>/<float>/<long>
    (char)<integer>
 */
		
		
		
		
		
		
		


	}

}
