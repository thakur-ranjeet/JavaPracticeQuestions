
public class Nestedifelse {
	public static void main(String[] args) {
		int a = 13;
		int b = 7;
		int c = 5;
		
		if(a > b) {
			System.out.println("a is bigger than b");
			if(a > c) {
				System.out.println("a is bigger than c");
				System.out.println("a is largest:"+a);
			}else {
				System.out.println("c is bigger than a");
				System.out.println("c is largest:"+c);
			}
		}else {
			System.out.println("b is bigger than a");
			if(b > c) {
				System.out.println("b is bigger than c");
				System.out.println("b is largest:"+b);
			}else {
				System.out.println("c is bigger thab b");
				System.out.println("c is largest:"+c);
			}
		}
	}
}
