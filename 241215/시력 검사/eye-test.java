import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        if (a >= 1.0 && b >= 1.0) {
            sb.append("High");
        } else if (a >= 0.5 && b >= 0.5) {
            sb.append("Middle");
        } else sb.append("Low");

        System.out.println(sb);
    }
}