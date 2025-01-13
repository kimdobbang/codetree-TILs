import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());
        // int c = Integer.parseInt(st.nextToken());

        // compare
        Integer[] arr = new Integer[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.print(arr[1]);

        // 배열 정렬
        // int[] arr = {a, b, c};
        // Arrays.sort(arr);
        // System.out.print(arr[1]);

        // 조건식
        // if ((a > b && a < c) || (a > c && a < b)) {
        //     System.out.print(a);
        // } else if ((b > a && b < c) || (b > c && b < a)) {
        //     System.out.print(b);
        // } else if ((c > a && c < b) || (c > b && c < a)) {
        //     System.out.print(c);
        // }
    }
}