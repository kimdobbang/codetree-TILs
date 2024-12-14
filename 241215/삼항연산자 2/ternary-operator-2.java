import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        char res = (a == 1) ? 't' : 'f';
        System.out.println(res);
    }
}