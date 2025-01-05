import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        if (m >= 90) {
            if ( f >= 95) {
                System.out.print(100000);
            } else if ( f >= 90) {
                System.out.print(50000);
            } else {
                System.out.print(0);
            }
        } else {
            System.out.print(0);
        }

    }
}