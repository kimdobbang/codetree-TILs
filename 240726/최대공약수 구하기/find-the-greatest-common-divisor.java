import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = getGcd(n, m);
		System.out.print(result);
	}

	public static int getGcd(int n, int m) {
		for (int i = Math.min(n, m); i > 1; i--) {
			if ( n % i == 0 && m % i == 0){
				return i;
			}
		}
		return 1;
	}
}