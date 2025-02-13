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
                // 하지만 공백이 i번 추가된다는 규칙을 보고 공백 추가 (i번 반복) 반복문과 알파벳 출력 (n - i 개) 반복문을 나눠 작성도 가능
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