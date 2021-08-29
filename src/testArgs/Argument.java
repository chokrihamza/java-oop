package testArgs;

public class Argument {
	public static void main(String[] args) {
        showValues(1,2,3,4,5);
	}
	
	public static void showValues(int... args) {
		for (int i : args) {
			System.out.println(i);
		}
	}



}
