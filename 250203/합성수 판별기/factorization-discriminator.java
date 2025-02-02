import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());
        
        boolean isC = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isC = true;
                // System.out.print("C");
                // return;
            }
        }
        // System.out.print("N");

        if (isC) {
            System.out.print("C");
        } else {
            System.out.print("N");
        }
                
    }
}