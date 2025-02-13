import java.io.*;
import java.util.*;

// i 번째 줄의 첫 번째 숫자는 n - i 이고, n - i 부터 시작해여 n 까지의 수가 출력되야 하므로, i 번째 줄의 j 번째 칸에는 n - i + j 를 출력

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(n - i + j).append(" ");
            }
            sb.append("\n");
        }

        // for (int i = n; i > 0; i--) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i <= j) {
        //             sb.append(j).append(" ");
        //         }
        //     }
        //     sb.append("\n");
        // }
        System.out.print(sb);
    }
}