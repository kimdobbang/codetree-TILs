import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        boolean exist = false;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                exist = true;
            }
        }
        if (exist) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}