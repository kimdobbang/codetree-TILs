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
        
        for (int i = 0; i < n * n; i += n) {
            for (int j = 0; j < n; j++) {
                sb.append((char) ('A' + i + j));
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

    }

    private static void input () throws IOException {
        n = Integer.parseInt(br.readLine());
    }
}