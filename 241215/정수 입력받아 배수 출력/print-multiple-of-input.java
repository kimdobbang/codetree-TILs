import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 5; i++) {
            sb.append(i * n);
            if (i < 5) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}