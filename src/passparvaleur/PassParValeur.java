package passparvaleur;

public class PassParValeur {

	public static void main(String[] args) {
		var x=10;
		showVal(x);
		

	}
	
	public static void showVal(int arg) {
		System.out.println(arg);
		arg=15;
	}
	


}
