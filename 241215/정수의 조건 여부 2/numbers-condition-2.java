import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if (a == 5) {
            sb.append("A");
        } if ((a & 1) == 0) {
            sb.append("B")
        }
        
        System.out.println(sb);
    }
}