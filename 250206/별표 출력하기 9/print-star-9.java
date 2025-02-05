import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
       int n = Integer.parseInt(br.readLine());

        // n줄 삼각형
        for(int i = 0; i < n; i++) {
            // n - i -1개 공백
            for(int j = 0; j < n - i - 1; j++) {
                sb.append(" ").append(" ");
            }

            // 2 * i + 1개 별
            for(int j = 0; j < 2 * i + 1; j++) {
                sb.append("*").append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
                
    }
}