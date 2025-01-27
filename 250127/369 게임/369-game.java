import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (isZero(i)) {
                sb.append(0);
            } else {
                sb.append(i);
            }
            if (i < n) {
                sb.append(" ");
            }
        }

        System.out.print(sb);
    }

    // 숫자가 3의 배수이거나 3, 6, 9 포함여부 확인
    public static boolean isZero(int num) {
    if (num % 3 == 0) { // 3의 배수면 바로 true 반환
        return true;
    }

    // 숫자로 처리
    while (num > 0) {
        int digit = num % 10; // 마지막 자릿수 확인
        if (digit == 3 || digit == 6 || digit == 9) {
            return true;
        }
        num /= 10; // 다음 아래자릿수 확인
    }

    // 문자로 처리
    // String nums = Integer.toString(num); // 각 자리 확인
    // for (char n : nums.toCharArray()) {
        // if (n == '3' || n == '6' || n == '9') {
            // return true;
        // }
    // }
    return false;
}

}