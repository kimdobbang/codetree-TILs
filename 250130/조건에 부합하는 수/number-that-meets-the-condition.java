import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0 && i % 4 !=0) {
                continue;
            } else if ((i / 8) % 2 == 0) {
                continue;
            } else if (i % 7 < 4) {
                continue;
            } sb.append(i).append(" ");
        }
        
        System.out.print(sb);
        
    }
}