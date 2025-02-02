import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n < 1000) { // n이 1000 이상이 될 때까지 반복
            if (n % 2 == 0) {
                n = n * 3 + 1;
            } else {
                n = n * 2 + 2;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
