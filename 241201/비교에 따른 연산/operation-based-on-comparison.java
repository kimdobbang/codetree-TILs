import java.io.*;
import java.util.*;


public class Main {
    static int result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            result = a * b;
        } else {
            result = b / a;
        }

        System.out.print(result);
    }
}