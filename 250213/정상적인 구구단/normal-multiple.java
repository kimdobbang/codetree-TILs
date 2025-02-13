import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                sb.append(i).append(" * ").append(j).append(" = ").append(i * j);
                if (j < n) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}