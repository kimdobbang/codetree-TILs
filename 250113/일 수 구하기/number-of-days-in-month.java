import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 28: 2
        // 30: 6, 9, 11
        // 31: 1, 3, 5, 7, 8, 10, 12
        if (n == 2){
            System.out.print(28);
        } else if (n == 6 || n == 9 || n == 11) {
            System.out.print(30);
        } else {
            System.out.print(31);
        }
    }
}