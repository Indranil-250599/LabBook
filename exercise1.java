package Lab1;
import java.util.Scanner;
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number=");
		int num = sc.nextInt();
		System.out.println("Sum of the cubes of the digit " + num + " is: " + cubesOfdigits(num));
		sc.close();

	}
	
	public static int cubesOfdigits(int number) {
		int sum = 0, rem;
		while(number > 0) {
			rem = number % 10;
			sum = sum + (rem*rem*rem);
			number = number / 10;
		}
		return sum;
	}

}