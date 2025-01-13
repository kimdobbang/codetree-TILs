import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++) {
            sb.append(a + n * i).append("\n");
        }
        System.out.print(sb);
    }
}