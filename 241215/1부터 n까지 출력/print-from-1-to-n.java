import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()) + 1;

        for(int i = 1; i < n; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}