import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;

    public static void main(String[] args) throws Exception {
        input();
        solution();
    }

    public static void solution() {
        /*
        핵심: 나눠생각하며 규칙을 찾자!
        1. 입력값 n을 받는다.
        2. n번 반복하며 (i = 0부터 n - 1까지):
         - 왼쪽 삼각형 출력 (별 n-i 개)
         - 공백 출력 (2*i 개)
         - 오른쪽 삼각형 출력 (별 n-i 개)
         - 줄 바꿈

        */
        StringBuilder sb = new StringBuilder();

    for(int i = 0; i < n; i++) {

        // [1] 왼쪽 직각삼각형 별(n - i개)
        for(int j = 0; j < n - i; j++) {
            sb.append("*");
        }

        // [2] 가운데 공백(i * 2개)
        for(int j = 0; j < 2 * i; j++) {
            sb.append(" ");
        }
       // [3] 오른쪽 직각함각형(n - i개)
        for(int j = 0; j < n - i; j++) {
            sb.append("*");
        }
        sb.append("\n");

    }

        System.out.println(sb);
    }

    public static void input() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
    }
}
