import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0 ; j < 2 * n + 1; j++) {
                if (i % 2 == 0 || j % 2  == 0) {
                    sb.append("* ");
                } else {
                    sb.append("  ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}