import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 || i % 3 == 0){
                sb.append(1).append(" ");
            } else{
                sb.append(0).append(" ");
                }
        }

        System.out.print(sb);
 
    }
}