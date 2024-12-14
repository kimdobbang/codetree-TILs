import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());

        if (a % 3 == 0) {
            sb.append("YES").append("\n");
        } else sb.append("NO").append("\n");

        if (a % 5 == 0) {
            sb.append("YES");
        } else sb.append("NO");

        System.out.println(sb);
    }
}