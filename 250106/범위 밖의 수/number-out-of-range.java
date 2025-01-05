import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a < 10 || a > 20) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}