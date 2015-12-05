import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		float temperature;
		
		System.out.print("Enter a temprature : ");
		Scanner sc = new Scanner(System.in);
		
		temperature = sc.nextFloat();
		sc.close();
		
		if( temperature < -20)
		{
			System.out.println(" Ice cold");
		}
		else if( (temperature >= -20) && (temperature <= 0 )){
			System.out.println(" Cold");
		}
		else if( (temperature >= 0 ) && (temperature <= 15)){
			System.out.println(" Chilly");
		}
		else if( (temperature >= 15) && (temperature <= 25)){
			System.out.println(" warm");
		}
		else if(temperature >= 25){
			System.out.println(" Very hot");
		}
		

	}

}
