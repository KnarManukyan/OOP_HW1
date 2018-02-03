package homework;
import java.util.Scanner;
public class pasta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = input.nextInt();
		while(num<1 || num>1000) {
			System.out.println("invalid number. Try again!");
			num = input.nextInt();
		}
		int numt=0;
		int nump=0;
		int nums=0;
		System.out.println("Enter pasta names " + num + " times!");
		int i=1;
		while(i<=num) {
		  String str = input.next();
		  str.toLowerCase().trim();
		 if(str.equals("tagliatelle"))
			 numt += 1;
		 else if(str.equals("penne")) 
			 nump += 1;
		 else if(str.equals("spagetti")) 
			 nums += 1; 
		 if (str.equals("tagliatelle") || str.equals("penne") || str.equals("spagetti"))
			 i++;
		 else
			System.out.println("Sorry, this type of pasta is not in my homework. Try again!"); 
		}
		int max = Math.max(numt, Math.max(nums,nump));
		if(max == numt) 
			System.out.println("Tagliatelle");
		else if(max == nums)
			System.out.println("Spagetti");
		else if(max == nump)
			System.out.println("Penne");
		input.close();
	}
}