import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int starE = n;
        int starO = 1;

        for (int i = 0; i < 2 * n; i++) {
            // 짝수일때
            if (i % 2 == 0) {
                for (int j = 0; j < starE; j++) {
                    sb.append("* ");
                }
                starE--;

            // 홀수일때
            } else {
                for (int j = 0; j < starO; j++) {
                    sb.append("* ");
                }
                starO++;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}