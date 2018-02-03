package homework;
import java.util.Scanner;
public class rectangle {
	
	public static void main(String[] args) {
	System.out.println("(1) Area");
	System.out.println("(2) Perimeter");
	System.out.println("(3) Draw");
	System.out.println("(4) Exit");
	System.out.println("What is your choice?");
	Scanner input = new Scanner(System.in);
	int choice = input.nextInt();
	while(choice != 4) {
		while (choice > 4) {
			System.out.println("Invalid number. Try again!");
			choice = input.nextInt();	
		}
		if(choice == 4) 
			break;
		System.out.println("Enter height!");
		int height = input.nextInt();
		System.out.println("Enter width!");
		int width= input.nextInt();			
		if(choice == 1) 
			System.out.println("Area is " + height * width);
		else if(choice == 2)
			System.out.println("Perimeter is " + 2*(height + width));
		else if(choice == 3) {
			System.out.println("Enter a symbol!");
			String symbol = input.next();
			for(int i=1; i<=height; i++) {
				for(int j=1; j<width; j++) { 
				System.out.print(symbol);
				}
				System.out.println(symbol);
			}
		}
	System.out.println("And now?");
	choice = input.nextInt();
	}
	input.close();
}
}