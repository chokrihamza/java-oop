package method_overload;

public class TestOverload {
   public static void main(String[] args) {
	var result=Overload.sum(10,20) ; 
	var result1=Overload.sum(10.0,20) ; 
	var result2=Overload.sum(10.0,20L) ; 
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
}
}
