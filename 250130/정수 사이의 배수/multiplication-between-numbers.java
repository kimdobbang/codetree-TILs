import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sumVal = 0;
        int cnt = 0;

        for(int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal += i;
                cnt ++;
            }
        }

        double avgVal = (double) sumVal / cnt;
        avgVal = Math.round(avgVal * 10) / 10.0;
        System.out.print(sumVal + " " + avgVal);
        // System.out.printf("%d %.1f", sumVal, avgVal); // printf 사용하여 출력
    }
}