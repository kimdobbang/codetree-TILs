import java.io.*;
import java.util.*;
// import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 정수 부분
        sb.append(a/b).append(".");

        // 소수 부분 구하기(a를 b로 나눈 나머지를 시작으로 소수점 자리 하나씩 계산)
        // 21번째 자리에서 내림하여 20자리까지 출력
        a %= b;
        for(int i = 0; i < 20; i++) {
            // 나머지 * 10 값 기준으로 b로 나눌 때 몫 20번 구하기
            a *= 10;
            sb.append(a / b);
            a %= b; // a를 b로 나눈 나머지 계속 갱신
        }
        System.out.print(sb);
        // // BigDecimal을 사용하여 나눗셈 계산 (소수점 21자리까지)
        // BigDecimal result = new BigDecimal(a).divide(new BigDecimal(b), 20, BigDecimal.ROUND_DOWN);
        // System.out.println(result.toPlainString());
    }
}