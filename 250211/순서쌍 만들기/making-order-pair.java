import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0 ; j--) {
                sb.append("(")
                .append(i)
                .append(",")
                .append(j)
                .append(")")
                .append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}