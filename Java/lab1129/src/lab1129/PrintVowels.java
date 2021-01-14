package lab1129;

public class PrintVowels {

	public static void main(String[] args) {
	String s = new String ("A Java program must have one or more classes. The name of the source file and the name of the class must be the same. If we want make a Java program executable, we must provide a main method. The main method is an indicator and a signature for Java Virtual Machine to find the entry point of the program for execution.");
    String sum = new String(""); 
	String get = new String("");
    
	int count = 0;
	char t,t1 ;//声明一个t，t字符用于检索每个字符，用count同步推进
	t1 = 0 ;
	
	while (count <=(s.length()-1)) {
		t = s.charAt(count);
		if(t == ' ') {//如果我们得到的t是一个空格
			get = s.substring (t1,count);
			
		}
		
		count ++;
		
	}
	
	}

}
