import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        if (m < 3 ) {
            System.out.print("Winter");
        } else if ( m < 6) {
            System.out.print("Spring");
        } else if ( m < 9) {
            System.out.print("Summer");
        } else if ( m < 12) {
            System.out.print("Fall");
        } else {
            System.out.print("Winter");
        }
    }
}