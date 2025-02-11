import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int cnt = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt > 8){
                    cnt = 2;
                }
                sb.append(cnt).append(" ");
                cnt += 2;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}