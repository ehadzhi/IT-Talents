import java.util.Scanner;

public class Task4 {
	
	static int perCharSum(String str){
		int sum = 0;
		
		for(int index = 0;index<str.length();index++){
			if( str.charAt(index) == ' '){
				continue;
			}
			
			sum += (int)str.charAt(index);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		String name1, name2;

		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" *, *|\n");
		//System.out.println(sc.delimiter());
		
		System.out.print("Enter the first and the second name seperated by a comma : ");
		name1 = sc.next();
		name2 = sc.next();
		
		if( perCharSum(name1) > perCharSum(name2)){
			System.out.println(name1);
		}
		else{
			System.out.println(name2);
		}
		
		sc.close();
	}

}
