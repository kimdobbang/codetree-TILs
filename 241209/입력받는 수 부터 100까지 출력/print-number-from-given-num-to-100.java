import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i <= 100; i++) {
            sb.append(i);
            if (i < 100) {
                sb.append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}