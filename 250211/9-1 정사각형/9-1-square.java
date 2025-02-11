import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int cnt = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt < 1) {
                    cnt = 9;
                }
                sb.append(cnt--);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}