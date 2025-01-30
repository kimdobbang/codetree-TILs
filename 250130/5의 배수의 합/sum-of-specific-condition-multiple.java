import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sumVal = 0;

        // a, b 관계 파악 후 a < b 되도록 대소 설정
        if (b < a) {
            int tmp = a; // a에 작은값 b 대입시, a값 사라지지 않도록 임시변수 선언
            a = b; // 더 작은 b가 a 되도록
            b = tmp; // 커야하는 b에 tmp(a)값 대입
        }
        

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                sumVal += i;
            }
        }
        System.out.print(sumVal);
    }
}