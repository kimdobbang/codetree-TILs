import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int m = Integer.parseInt(br.readLine());
        
        // m번 반복하며 cnt 계산
        for (int i = 0; i < m; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            // n이 1이 될때 까지 반복
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    cnt++;
                    continue;
                }
                if (n % 2 == 1) {
                    n *= 3;
                    n++;
                    cnt++;
                }
            }
            // while문 종료마다 append
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}