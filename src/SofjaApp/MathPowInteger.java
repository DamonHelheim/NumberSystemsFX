package SofjaApp;

public class MathPowInteger {

public static long power(long a, long b){
	
	 return powerRedirection(a, b, 1);
		
	}
	
public static long powerRedirection(long a, long b, long c){
	
	if(b == 0) {return c;}
	
	else  return powerRedirection(a, b-1, c = c*a);
	
}


}
