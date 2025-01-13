import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int am = Integer.parseInt(st.nextToken());
        int ae = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int bm = Integer.parseInt(st.nextToken());
        int be = Integer.parseInt(st.nextToken());

        // 수학점수 같을 때
        if (am == bm) {
            if (ae > be) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        } else if (am > bm) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
        
    }
}