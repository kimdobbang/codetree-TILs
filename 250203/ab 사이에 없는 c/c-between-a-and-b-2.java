import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean hasC = true;
        for (int i = a; i <= b; i++) {
            if (i % c != 0) {
                hasC = false;
                break;
            }
        }
        
        if (hasC) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
        
    }
}