import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        // i: 2 * n - 1행
        // 공백: i개
        // *: 첫 행에 2 * n - 1개를 시작으로 i++ 마다 2개씩 감소
        // 대칭인 지점: n - 1행 (i < n - 2 까지만 감소하다가 그 이후 증가)

        int star = 2 * n - 1;
        int blank = 0;
        for(int i = 0; i < 2 * n - 1; i++) {
            // 공백: i개
            for(int j = 0; j < blank; j++) {
                sb.append("  ");
            }
            // 별 : 2 * n - 1개를 시작으로 2개씩 감소
            for(int j = 0; j < star; j++) {
                sb.append("* ");
            }

            if(i < n - 1) {
                star -= 2;
                blank += 1;
            } else {
                star += 2;
                blank -= 1;
            }
            sb.append("\n");
        }
        System.out.print(sb);     
    }
}