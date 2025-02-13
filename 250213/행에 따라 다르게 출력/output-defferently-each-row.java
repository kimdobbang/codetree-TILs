import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 필요 변수 선언 및 입력(짝수행이 될 때 2가 더해져야하므로 0으로 초기화하고 짝수행일 떼 +=2 처리)
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // 홀수 행
                if (i % 2 == 0) {
                    cnt ++;
                    sb.append(cnt).append(" ");
                    continue;
                }
                // 짝수 행
                cnt += 2;
                sb.append(cnt).append(" ");
                
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}