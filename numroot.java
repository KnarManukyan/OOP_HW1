package homework;
import java.util.Scanner;
public class numroot {
	static public int digits (int x) {
		if(x == 0) 
			return 0;
		return x%10 + digits(x/10);
	}
	static public int num_root(int x) {
		int sum = digits(x);
		while(sum>10) {
			sum = digits(sum); 
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = input.nextInt();
		System.out.println("The numeric root of " + num + " is " + num_root(num));
		input.close();
	}	
}