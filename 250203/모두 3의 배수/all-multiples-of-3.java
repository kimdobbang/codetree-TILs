import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isPerfect = true;
        for(int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 3 != 0) {
                isPerfect = false;
                break;
            }
        }

        if (isPerfect) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}