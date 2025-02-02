import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (n == 1) {
                System.out.print(cnt);
                break;
            } else if (n % 2 == 0) {
                n /= 2;
                cnt ++;
            } else if (n % 2 == 1) {
                n *= 3;
                n += 1;
                cnt ++;
            }
        }
                                
    }
}