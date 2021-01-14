
public class in1022 {

	public static void main(String[] args) {
		int n1 = 2 ;
		int n2 = 20 ;
		int result = n1 + n2 ;
		int text = 15 ;
		
		
		System.out.println("10+20="+ result ); //输出打印指令
		//当要同时输出变量的时候，（“XXXXXX”+ 变量）
		//当要进行运算（包括关系运算），使用（“XXXXXX”+（运算））
		
		if(n1 == 10)
		{
			
			System.out.println("OK!");
			
		}
		
		else
		{
			
			System.out.println("NO!");
		}
		//条件语句模板
//		如果你在if中声明了一个变量，它只能在if中表达和使用。
		
		int a = 0;
		System.out.println("这是if前的a "+a);
		
		if(a==0) {
		 int b=10;
		System.out.println("这是在if生成的语句"+b);
		//if中生成了一个b，但这个b只能在if语句中使用。
		} 
		
		//嵌套条件语句的写法和C.差不多
		
		System.out.println("Over ");

	  
	if (text<10) {
		
		System.out.println("TEXT<10!");
		
	}

	else if (text>20)
	{
	System.out.println("Text>20!");	
	}
	else
	{
	System.out.println("Text>20,But it >10 !");	
	}



	//当关系运算正确时，会输出Ture,否则会输出Flase，我也不知道这个是比C 聪明还是比C 笨逼 
	//这个是我类比C进行测试的，课堂上还没讲、或者说没有细究这一块，因此这个用法和结论可能有误，虽然大概率是这样


	System.out.println("这是一个关于关系运算符的测试 ：  "+(10<1) );




	//Switch语句，适用于多条件判断
	/*
	 switch(variableName)
	 {
	 case <val1>:语句  ;break;  (break代表成功后跳出，能不能不加而在判断成功后继续执行Switch?)
	 case <val2>:语句  ;break;
	 default:语句;
	 
	 }
	 */

	int t =4 ;
	switch(t) {
	case 1:System.out.print("星期一");break;
	case 2:System.out.print("星期二");break;
	case 3:System.out.print("星期三");break;
	case 4:System.out.print("星期四");break;
	case 5:System.out.print("星期五");break;
	case 6:System.out.print("星期六");break;
	case 7:System.out.print("星期日");break;
	default:System.out.print("错误");
	}

	//Ternary Operator 三元运算符  可以认为是if else 的简写（见1029）

	int alpha = 18,beta = 78;

	int result1 = ((alpha > beta)? alpha:beta) ;
	System.out.println("更大的数字是"+result1 );

	char s = 'd';
	System.out.print("char 定义的 文字是"+s );
	//字符用  char 定义，并且用单引号 ‘’ 输入。
	}

}
