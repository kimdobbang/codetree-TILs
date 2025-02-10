import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("*");
                sb.append("\n");
            } else {
                for (int j = 0; j < i + 1; j++) {
                    sb.append("* ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}