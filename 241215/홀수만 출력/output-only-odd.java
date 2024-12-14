import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (; a <= b; a++) {
            if ((a & 1) != 0) {
                sb.append(a);
                
                if (a < b) {
                sb.append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}