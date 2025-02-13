import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;

    public static void main(String[] args) throws Exception {
        input();
        solution();
        bw.flush();
    }

    public static void solution() throws IOException {
        StringBuilder sb = new StringBuilder();
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // i > j 영역에 공백넣고 continue처리
                if (i > j) {
                    sb.append("  ");
                    continue;
                }

                // i <= j라면(n - i부터) Z보다 작은지 검증하여 append
                if (letter > 'Z') {
                    letter = 'A';
                }
                sb.append(letter++).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
}