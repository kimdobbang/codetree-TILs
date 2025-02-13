import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < i; j++) {
                sb.append("  ");
            }

            // 숫자
            for (int j = 0; j < n - i; j++) {
                sb.append(n - i - j).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}