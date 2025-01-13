import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) {
            System.out.print(false);
        } else if (y % 4 == 0) {
            System.out.print(true);
        }
    }
}