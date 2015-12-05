
public class Task14 {

	static int fact(int n){
		int fact = 1;
		while( n >= 2){
			fact *= n;
			n--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int n = 7;
		
		System.out.println( fact(n) );
	}

}
