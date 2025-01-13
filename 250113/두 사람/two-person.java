import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int firstA = Integer.parseInt(first[0]);
        String firstS = first[1];

        String[] second = br.readLine().split(" ");
        int secondA = Integer.parseInt(second[0]);
        String secondS = second[1];

        if (
            (firstA >= 19 && firstS.equals("M"))
            ||
            (secondA >= 19 && secondS.equals("M"))
        ) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}