import java.util.Scanner;

public class NthEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += 2*i;
		}
		System.out.println("Sum is " +sum);
	}
}
