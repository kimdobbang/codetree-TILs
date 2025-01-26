import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int num = a; num <= b;) {
            sb.append(num).append(" ");
            if (num % 2 == 0) {
                num += 3;
            } else if (num % 2 != 0) {
                num *= 2;
            }
        }
        System.out.print(sb);
    }
}