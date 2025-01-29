import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        int sumVal = 0;
        
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n % 2 != 0 && n % 3 == 0) {
                sumVal += n;
            }
        }
        System.out.print(sumVal);
    }
}