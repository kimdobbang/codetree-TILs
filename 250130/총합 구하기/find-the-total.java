import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int answer = 0;

        for(int i = a; i <= b; i++) {
            if (i % 6 == 0 && i % 8 != 0) {
                answer += i;
            }
        }
        System.out.print(answer);
    }
}