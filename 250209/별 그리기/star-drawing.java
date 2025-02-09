import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        /*
        i : 2 * n - 2
        위쪽 * : 2 * i + 1
        대칭 : n - 1 번째 줄
        */
        int blank = n - 1;
        int star = 1;

        for (int i = 0; i < 2 * n - 1; i++) {
            // 공백
//            int blank = i < n ? n - 1 - i: i - n + 1;
            for(int j = 0; j < blank; j++) {
                sb.append(" ");
            }

            if (i < n - 1) {
                blank--;
            } else {
                blank++;
            }

            // 별
//            int star = i < n ? 2 * i + 1: (4 * n - 3) - (2 * i);
            for(int j = 0; j < star; j++) {
                sb.append("*");
            }
            sb.append("\n");

            if (i < n - 1) {
                star += 2;
            } else {
                star -= 2;
            }
        }
        System.out.print(sb);
        
    }
}