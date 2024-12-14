import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        sb.append((a > b)? 1 : 0).append("\n");
        sb.append((a > c)? 1 : 0).append("\n");
        sb.append((a > d)? 1 : 0).append("\n");
        sb.append((a > e)? 1 : 0).append("\n");

        System.out.println(sb);
    }
}