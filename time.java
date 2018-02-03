package homework;
import java.util.Scanner;
public class time {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hour");
		int hours = input.nextInt();;
		System.out.println("minutes");
		int minutes = input.nextInt();;
		System.out.println("seconds");
		int seconds = input.nextInt();;   
		if(hours > 23 || hours < 0 || minutes > 59 || minutes < 0 || seconds > 59 || seconds < 0)
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
