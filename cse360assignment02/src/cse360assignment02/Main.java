package cse360assignment02;

public class Main {

		public static void main(String[] args) {
			
			AddingMachine myCalculator = new AddingMachine();
			
			myCalculator.add(4);
			myCalculator.subtract(2);
			myCalculator.add(5);
			System.out.println(myCalculator.getTotal());
			System.out.println(myCalculator.toString());
			
		
			myCalculator.clear();
			System.out.println(myCalculator.toString());
			myCalculator.add(4);
			System.out.println(myCalculator.toString());
		}
}
