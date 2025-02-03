import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        boolean hasGCD = false;
        for (int i = a; i <= b; i++) {
            if (1920 % i == 0&& 28800 % i == 0) {
                hasGCD = true;
                break;
            }
        }
        if (hasGCD) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}