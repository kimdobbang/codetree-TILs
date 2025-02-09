import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 2n - 1 줄
        for (int i = 0; i < 2 * n - 1; i++) {
            // 공백
            for (int j = 0; j < n - 1 - i; j++) {
                sb.append("  ");
            }
            // @
            int cnt = i < n ? i + 1 : 2 * n - 1  - i;
            for (int j = 0; j < cnt; j++) {
                sb.append("@ ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}

// 1인경우
// n = 2, i = 2 >>> 3
// n = 3, i = 4 >>> 5
// n = 4, i = 6 >>> 7