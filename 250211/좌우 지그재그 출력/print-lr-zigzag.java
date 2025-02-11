import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // 홀수 행(0, 2행)
                if (i % 2 == 0) {
                    sb.append(i * n + j + 1).append(" ");
                    continue;
                }

                //짝수 행(1, 3행))
                sb.append((i + 1) * n - j).append(" ");

            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}