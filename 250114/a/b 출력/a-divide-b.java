import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // BigDecimal을 사용하여 나눗셈 계산 (소수점 21자리까지)
        BigDecimal result = new BigDecimal(a).divide(new BigDecimal(b), 20, BigDecimal.ROUND_DOWN);

        // 결과 출력
        System.out.println(result.toPlainString());        
        
    }
}