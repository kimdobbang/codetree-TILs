import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        // int prob = 1;

        // for(int i = 1; i <= b; i++) {
        //     if (i % a == 0) {
        //         prob *= i;
        //     }
        // }
        // System.out.print(prob);

        //  재귀(비효율적)
        System.out.print(sol(a, b));
        
    }

    public static int sol(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            if (b % a == 0) {
                return b * sol(a, b - 1);
            } else {
                return sol(a, b - 1);
            }
        }
    }
}