import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int a = sc.nextInt();

        // 남
        if (g == 0) {
            if (a >= 19) {
                System.out.print("MAN");
            } else {
                System.out.print("BOY");
            }
        } 
        // 여
        else if (g == 1) {
            if (a >= 19) {
                System.out.print("WOMAN");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}