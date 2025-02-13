 import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // sb.append("(").append(i).append(", ").append(j).append(") ");
                sb.append(String.format("(%d, %d) ", i, j));
                if ((i + j) % 4 == 0) {
                    sb.append("\n");
                }
            }
        }
        // System.out.print(sb);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}