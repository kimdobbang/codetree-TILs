import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (isZero(i)) {
                sb.append(0).append(" ");
            } else {
                sb.append(i).append(" ");
            }
        }

        System.out.print(sb.toString().trim());
    }

    public static boolean isZero(int num){

        if (num % 3 == 0 || is369(num)) {
            return true;
        }

        return false;
    }

    public static boolean is369(int num) {
        String nums = Integer.toString(num);
        for(char n : nums.toCharArray()) {
            if (n == '3' || n == '6' || n == '9') {
                return true;
            }
        }
        return false;
    }
}