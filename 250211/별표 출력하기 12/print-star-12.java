import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i  = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || (j % 2 == 1 && i <= j)) {
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