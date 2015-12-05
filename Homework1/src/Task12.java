import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int day, month, year;
		boolean leapYear;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(", *| |\r");
		
		System.out.print("Enter a date in the format DD,MM,YYYY : ");
		
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		
		sc.close();
		
		if ( year % 4 != 0){
			leapYear = false;
		}
		else if( year % 100 != 0){
			leapYear = true;
		}
		else if( year % 400 != 0){
			leapYear = false;
		}
		else
			leapYear = true;
		
		
		if( day < 28){
			day++;
		}
		else if( day == 28){
			if( month != 2){
				day++;
			}
			else {
				if ( leapYear ){
					day++;
				}
				else {
					day = 1;
					month++;
				}
			}
		}
		else if( day == 29){
			if( month != 2 ){
				day++;
			}
			else {
				day = 1;
				month++;
			}
		}
		else if( day == 30){
			if( month == 4 || month == 6 || month == 9 || month == 11 ){
				day = 1;
				month++;
			}
			else{
				day++;
			}
		}
		else if( day == 31){
			if( month == 12 ){
				year++;
				month = 1;
				day = 1;
			}
			else{
				month++;
				day = 1;
			}
		}
			
			
		System.out.println("The next day is : " + day + "," + month + "," + year);

	}

}
