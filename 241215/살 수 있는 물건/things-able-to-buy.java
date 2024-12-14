import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if (n >= 3000) {
            sb.append("book");
        } else if (n >= 1000) {
            sb.append("mask");
        } else {
            sb.append("no");        
        }
        
        System.out.println(sb);
    }
}