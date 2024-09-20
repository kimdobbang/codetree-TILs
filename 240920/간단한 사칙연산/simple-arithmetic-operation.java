import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sb.append(a + b).append("\n").append(a - b).append("\n").append(a/b).append("\n").append(a%b);
        System.out.print(sb);
    }
}