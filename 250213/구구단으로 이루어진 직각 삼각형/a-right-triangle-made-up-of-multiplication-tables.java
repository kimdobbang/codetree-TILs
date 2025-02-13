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

    public static void solution() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                sb.append(String.format("%d * %d = %d",i , j ,i * j ));
                if (j < n - i + 1) {
                    sb.append(" / ");
                }
            }
            sb.append("\n");
        } 
  
        bw.write(sb.toString());
    }
    
    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
}

