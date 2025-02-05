import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        // n줄의 삼각형
        for(int i = 0; i < n; i++) {
            // i개의 공백 추가
            for(int j = 0; j < i; j++) {
                sb.append(" ").append(" ");
            }

            // 2 * (n - i) -1 개의 별 추가
            for(int j = 0; j < 2 * (n - i) - 1; j++) {
                sb.append("*").append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
                
    }
}