import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean hasNotC = true; // 기본값을 true로 설정

        for (int i = a; i <= b; i++) {
            if (i % c == 0) { // 하나라도 c의 배수가 있으면 false로 변경
                hasC = false;
                break; // 더 확인할 필요 없음, 즉시 종료
            }
        }

        if (hasNotC) {
            System.out.print("YES"); // c의 배수가 없으면 YES 출력
        } else {
            System.out.print("NO"); // c의 배수가 하나라도 있으면 NO 출력
        }
    }
}
