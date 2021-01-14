package notes;

public class lhy03循环语句 {

	public static void main(String[] args) {
		//1.
		int count1 = 13;
		while ( count1 <= 20 )
		{
		System.out.println("Count is: " + count1 );
		count1 ++;

		}
		/*
		 while (条件)
		 {
		       循环体里的语句; ......
		   ...
		   一般需要设置一个语句来改变判断值，以免进入死循环。（称这种语句为Update）
		   
		   *  Java的while写法和C是一样的。      
		 }
		 */
		System.out.println("Count was "+count1 + "  when the condition become false");



		//2.for 循环

			
			/*
			 for(初始化值(进入循环前执行的);执行条件 ; update更新参数){
			 
			 
			 语句.........
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
		 初始值
		 do{
		 语句;
		 更新参数
		 }while (条件);
		 
		 
		 就是做了一次循环之后，再去检查条件，再去判断是否二次执行条件。  
		 
		 *语法和 C 相同。
		 
		 */


		//Constant 常数设置   这个数的值不会被改变
		final double PI = 3.14159 ; //这里定义了double变量 PI，这个变量是一个常量，它不会改变。
		System.out.println("PI is " + PI);


	}

}
