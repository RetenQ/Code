package lecture10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			int nextInteger = sc.nextInt();
			System.out.println(nextInteger);
			while(sc.hasNext()) {
				String str = sc.next();
				if(str.equals("q")) break;
				int value = Integer.parseInt(str);
				System.out.println(value);
			}
			
		}catch (InputMismatchException ime ) {
			sc.close();
			ime.printStackTrace();
			
		}catch (NumberFormatException nfe ) {
			sc.close();
			nfe.printStackTrace();
		}
		System.out.println("At the end of the program");
		}
	}
