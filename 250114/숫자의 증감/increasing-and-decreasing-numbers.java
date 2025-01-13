import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String c = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        if (c.equals("A")) {
            // 오름차순
            for (int i = 1; i <= n; i++) {
                sb.append(i).append(" ");
            }
        } else if (c.equals("D")) {
            // 내림차순
            for (int i = n; i >= 1; i--) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
 
    }
}