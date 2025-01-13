import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i * 3 <= n) {
            System.out.print(i * 3 + " ");
            i++;
        }
        
    }
}