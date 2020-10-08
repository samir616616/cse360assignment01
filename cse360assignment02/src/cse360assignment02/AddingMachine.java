package cse360assignment02;

public class AddingMachine {
	private int total;
	private String uses;
	
	public AddingMachine () {
		total = 0; // not needed -included for clarity
		uses = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		uses += " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		uses += " - " + value;
	}
	
	public String toString () {
		return uses; //code to turn into string
	}
	
	public void clear() {
	
		total = 0;
		uses = "0";
		
	} //clears inputs

}
