import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // 홀수 행
                if (i % 2 == 0) {
                    num ++;
                    sb.append(num).append(" ");
                    continue;
                }
                // 짝수 행
                num += 2;
                sb.append(num).append(" ");
                
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}