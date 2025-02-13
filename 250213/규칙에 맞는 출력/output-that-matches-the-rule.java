import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    sb.append(j).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}