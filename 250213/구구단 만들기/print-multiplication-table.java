import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i < 10; i++) {
            for (int j = b; j >= a; j -= 2) {
                sb.append(j).append(" * ").append(i).append(" = ").append(i * j);
                if ( j > a) {
                    sb.append(" / ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}