import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        // // 길이가 n 인 직각 삼각형
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <=i; j++) {
        //         sb.append("*");
        //     }
        //     sb.append("\n").append("\n");
        // }

        // // 길이가 n - 1인 직각 삼각형
        // for(int i = n - 1; i > 0; i--) {
        //     for(int j = 0 ; j < i; j++){
        //         sb.append("*");
        //     }
        //     sb.append("\n").append("\n");
        // }

        int star = 1;

        for(int i = 0; i < 2 * n - 1; i++) {
            for(int j = 0; j < star; j++) {
                sb.append("*");
            }
            sb.append("\n");

            // 한 줄 건너뛰기
            if (i == 2 * n -2) {
                continue;
            } else {
                sb.append("\n");
            }

            if(i < n - 1) {
                star ++;
            } else {
                star --;
            }
        }

        System.out.print(sb);                
    }
}