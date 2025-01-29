import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}