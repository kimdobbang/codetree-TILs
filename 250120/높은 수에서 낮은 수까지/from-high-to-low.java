import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for(int i = max; i >= min; i--) {
            sb.append(i).append(" ");
        }

        System.out.print(sb);
 
    }
}