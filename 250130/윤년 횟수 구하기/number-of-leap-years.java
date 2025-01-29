import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // int cnt = 0;
                
        int n = Integer.parseInt(br.readLine());
        // O(1) 방식으로 윤년 개수 계산
        int cnt = (n / 4) - (n / 100) + (n / 400);

        // for (int i = 1; i <= n; i++) {
            // if (i % 4 == 0) {
                // cnt++;
            // } 
            // if (i % 100 == 0 && i % 400 != 0) {
                // cnt--;
            // }
        // }
        System.out.print(cnt);
    }
}