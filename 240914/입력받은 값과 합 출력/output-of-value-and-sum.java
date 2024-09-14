import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // ()하면 연산되어 들어감
        sb.append(a + " " + b + " " + (a+b));
        System.out.println(sb);

        // () 안하면 문자열로 들어감
        // sb.setLength(0);
        // sb.append(a + " " + b + " " + a+b);
        // System.out.println(sb);
    }
}