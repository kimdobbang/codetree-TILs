import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();    
        int n = Integer.parseInt(br.readLine());

        int blank = n - 1;
        int star = 1;

        for (int i = 0; i < 2 * n -1; i++) {
            for(int j = 0; j < blank; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < star; j++) {
                sb.append("* ");
            }

            sb.append("\n");
            
            if (i < n - 1) {
                star ++;
                blank --;
            } else {
                star --;
                blank ++;
            }
            
        }
        System.out.print(sb);
    }
}