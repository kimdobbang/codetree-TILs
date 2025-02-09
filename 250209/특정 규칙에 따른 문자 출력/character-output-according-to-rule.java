import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 2 * n - 1; i++) {
            // 공백
            for (int j = 0; j < n - 1 - i; j++) {
                sb.append("  ");
            }
            // @
            int cnt = i < n - 1 ? i : n + 1 - i;
            for (int j = 0; j <= cnt; j++) {
                sb.append("@ ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}