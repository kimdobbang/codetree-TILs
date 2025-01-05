import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // and 연산자를 안쓴다면
        int min = a;
        if (b < min) {
            min = b;
        }
        if ( c < min) {
            min = c;
        }
        System.out.println(min);

        // 문제 요구대로 and 연산자 활용하면
        // if (a <= b && a <= c) {
        //     System.out.println(a);
        // } else if ( b <= a && b <= c) {
        //     System.out.println(b);
        // } else if (c <= a && c <= b) {
        //     System.out.println(c);
        // }

    }
}