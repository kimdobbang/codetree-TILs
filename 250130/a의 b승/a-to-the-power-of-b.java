import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int answer = pow(a, b);

        System.out.print(answer);
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * pow(a, b - 1);
    }
}