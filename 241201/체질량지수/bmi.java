import java.io.*;
import java.util.*;

public class Main {
    static Long b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long h = Long.parseLong(st.nextToken());
        Long w = Long.parseLong(st.nextToken());
        b = (10000 * w) / (h * h);
        System.out.println(b);

        if ( b > 25) {
            System.out.println("Obesity");
        }
    }
}