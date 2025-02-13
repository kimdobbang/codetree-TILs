import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    public static void main(String[] args) throws IOException {
        input();
        solution();
        bw.flush();
    }

    private static void solution () throws IOException {
        StringBuilder sb = new StringBuilder();
        char letter = 'A'; // 기존 연산에서 char 변수를 직접 ++하도록 최적화
        
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                sb.append(letter++);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

    }

    private static void input () throws IOException {
        n = Integer.parseInt(br.readLine());
    }
}