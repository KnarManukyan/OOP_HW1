package homework;
import java.util.Scanner;
public class time {
	static public int hours(int x) {
		return x / 10000;
	}
	static public int minutes(int x) {
		return x / 100 % 100;
	}
	static public int seconds(int x) {
		return x % 100;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time!");
		int time = input.nextInt();
		int hours = hours(time);
		int minutes = minutes(time);
		int seconds = seconds(time);   
		if(hours > 23 || hours < 0 || minutes > 59 || seconds > 59)
			System.out.println("Invalid time!");
		else {
			if(seconds == 59) {
				seconds = 0;
				if(minutes == 59) {
					minutes = 0;
					if (hours != 23)
						hours += 1;
					else 
						hours = 0;
				}	
				else  
					minutes += 1;
			} 
			else
			seconds +=1;
		System.out.println(hours+":"+minutes+":"+seconds);
		}
		input.close();
	}
}
