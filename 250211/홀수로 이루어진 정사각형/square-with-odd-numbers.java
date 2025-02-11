import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        for (int i = 10; i < 10 + 2 * n; i += 2) {
            for (int j = 0; j < 2 * n; j += 2) {
                sb.append(i + (j + 1)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}