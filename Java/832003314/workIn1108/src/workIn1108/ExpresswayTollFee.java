package workIn1108;

public class ExpresswayTollFee {

	public static void main(String[] args) {
		
		char vehicle = 'v';
		
		char c = 'c';
		char m = 'm';
		char b = 'b';
		char t = 't';
		char v = 'v';
		
		if (vehicle == c) 
			System.out.println("Car - 2.00");
		else if (vehicle == m)
			System.out.println("Motobike - 1.10");
		else if (vehicle == b) 
			System.out.println("b - 4.25");
		else if (vehicle == t)
			System.out.println("Truck - 6.70");
		else if (vehicle == v) 
			System.out.println("Van - 4.00");
		
		System.out.println("Over");

	}

}
