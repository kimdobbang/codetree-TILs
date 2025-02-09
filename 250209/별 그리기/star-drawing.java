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
        아래쪽 * : 2 * (i + 2 * n - 2 - i - i) + 1( i대신 a + b  -i 대입, a가 i, b가 2 * n - 2 - i)
        */

        for (int i = 0; i < 2 * n - 1; i++) {

            // 공백
            int blank = i < n -1 ? n - 1 - i: i - n + 1;
            for(int j = 0; j < blank; j++) {
                sb.append(" ");
            }

            // 별
            int star = i < n ? 2 * i + 1: (2 * n + 3) -  (2 * i);
            for(int j = 0; j < star; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}