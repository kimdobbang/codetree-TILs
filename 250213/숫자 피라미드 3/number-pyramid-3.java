import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                sb.append(i * j).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}