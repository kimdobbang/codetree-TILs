import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int i = 1;
        
        while (i <= n) {
            sb.append(i).append(" ");
            i++;
        }
        System.out.print(sb);
    }
}