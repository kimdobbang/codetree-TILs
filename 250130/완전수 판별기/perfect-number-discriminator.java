import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        int n = Integer.parseInt(br.readLine());


        int sumVal = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumVal += i;
            }
        }

        if (sumVal == n) {
            System.out.print("P");
        } else {
            System.out.print("N");
        }
        
    }
}