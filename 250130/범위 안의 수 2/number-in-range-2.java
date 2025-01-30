import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sumVal = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            if (0 <= n && n <= 200) {
                sumVal += n;
                cnt ++;
            }
        }

        // double avgVal = Math.round((double) sumVal / cnt * 10) / 10.0;
        double avgVal = (double) sumVal / cnt;
        avgVal = Math.round(avgVal * 10) / 10.0;

        System.out.print(sumVal + " " + avgVal);
        // System.out.printf("%d %.1f", sumVal, avgVal);
        
    }
}