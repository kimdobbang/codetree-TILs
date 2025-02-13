import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(cnt).append(" ");
                cnt++;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}