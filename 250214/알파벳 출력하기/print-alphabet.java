import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        char letter = 'A';
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (letter > 'Z') {
                    letter = 'A';
                }
                sb.append(letter++);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}