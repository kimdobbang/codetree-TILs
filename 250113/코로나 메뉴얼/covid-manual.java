import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cntA = 0;
        for (int i = 0; i < 3; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            if (s.equals("Y") && t >= 37) {
                cntA ++;
                if (cntA >= 2) {
                    System.out.print("E");
                    return;
                }
            }
        }
        System.out.print("N");
    }
}