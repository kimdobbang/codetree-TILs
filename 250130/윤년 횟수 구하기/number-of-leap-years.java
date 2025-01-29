import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
                
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                cnt++;
            } 
            if (i % 100 == 0 && i % 400 != 0) {
                cnt--;
            }
        }
        System.out.print(cnt);
    }
}