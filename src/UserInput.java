import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter you age:");
//		int age = sc.nextInt();
//		System.out.println("Your age is "+age);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int result = firstNumber + secondNumber;
		System.out.println(result);
	}
}
