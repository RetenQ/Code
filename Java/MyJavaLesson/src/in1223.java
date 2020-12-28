
public class in1223 {

	public static void main(String[] args) {
		//
	//1.类 Class
		/*
		  
		 
		 */
		class Student {//定义一个Student类
			public void speak() {
				//定义功能speak
			}
		}

	//2.方法
		/*
		  [访问权限] [数据类型] [方法名] [参数列表] {
		                  [具体方法]
		      }     
		      
		 访问权限类型（见PDF） private   protected   public  还有不写 （不写的时候同一个包里面的可以访问）    
		 数据类型
		 
		      
		 返回值return <> ; 将<>中的东西返回该数据类型，可以是变量也可以是具体的东西
		      return 0 ; 返回0     
		      
		      
		 
		 方法体：在{}中用Java语言写的东西，一般在先写框架的时候会先存根
		 存跟    ：一个空语句  加上一个返回值  return <>
		 
		 方法签名 ：
		 方法重载：通过修改（不包括访问权限、数据类型和return）参数列表的个数或列表内的数据类型，实现重载
		 模糊重载：

		 */
	//3.链式方法调用
		/*
		  在一个方法中调用其他的方法来使用，就是链式方法调用 
		 */
		
	//4.静态方法
		/*
		 静态方法只能说跟上着类class加载的，而非静态方法需要实例化一个对象后使用
		 非静态： Test t1 = new Test3() ; 
		         t1.method2()
		     静态： method()
		     
		另外，在静态方法中只能调用静态的方法，若在其中使用非静态方法，需要先实例化再使用
		
		Parameter 允许传入任意个参数   public static add (int ... values)
		
		
		     
		 */
		
		for(int i =1 ; i<11 ; i++) {
			a(1); //调用方法a  [名字](参数数字) ; 
		}
		
	}
	     public static void a(int i) {//一个求i是否是偶数的方法
	    	 if(i % 2 == 0 ) {
	    		 System.out.print("是");
	    	 }
	     }
}
