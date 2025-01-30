import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine().trim());
        int sumVal = 0;
        double avgVal;

        for (int i = 0; i < n; i++) {
            sumVal += Integer.parseInt(br.readLine().trim());
        }

        avgVal = (double) sumVal / n;

        System.out.printf("%d %.1f", sumVal, avgVal);
        
    }
}