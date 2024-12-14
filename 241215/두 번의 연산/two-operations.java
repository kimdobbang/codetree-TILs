import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if ((a & 1) == 1) {
            a += 3;
        } if ( a % 3 == 0) {
            a /= 3;
        }
        
        System.out.println(a);
    }
}