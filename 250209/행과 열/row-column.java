import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b; j++) {
                sb.append(i * j).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}