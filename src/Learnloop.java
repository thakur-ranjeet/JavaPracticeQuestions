import java.util.Scanner;

public class Learnloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
//		for(int i = 0; i<=5; i++) {
//			System.out.println(i);
//		}
		for(int i = 1; i<=n; i++) {
			System.out.println(n+ "*" +i+ "="+i*n);
		}
	}
}