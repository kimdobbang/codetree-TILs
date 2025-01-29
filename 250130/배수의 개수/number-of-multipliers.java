import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cntT = 0;
        int cntF = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n % 3 == 0) {
                cntT++;
            }
            if (n % 5 == 0) {
                cntF++;
            }
        }
        System.out.print(cntT + " " + cntF);
    }
}