import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0){
                    sb.append("*");
                } else {
                    sb.append("**");
                }
            }
            sb.append("\n");

            // 또는 반복 횟수를 j < 2 * i +1로 늘리기
        }
        System.out.print(sb);
    }
}