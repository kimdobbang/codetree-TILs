import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int num = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // i <= j일때 append후 ++ 하고 10되면 1로 초기화
                if (i <= j) {
                    if (num == 10) {
                        num = 1;
                    }
                    sb.append(num++).append(" ");
                    continue;
                }
                sb.append("  ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}