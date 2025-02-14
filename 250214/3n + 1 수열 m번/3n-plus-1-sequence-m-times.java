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

            while (true) {
                // 1되면 출력 반복문 종료
                if (n == 1) {
                    sb.append(cnt).append("\n");
                    break;
                }
                // n이 짝수
                if (n % 2 == 0) {
                    n /= 2;
                    cnt++;
                    continue;
                }
                // n이 홀수
                if (n % 2 == 1) {
                    n *= 3;
                    n++;
                    cnt++;
                }

            }
        }
        System.out.print(sb);
    }
}