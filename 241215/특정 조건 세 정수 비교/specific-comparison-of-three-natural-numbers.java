import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        if (a =< b && a =< c){
             sb.append(1).append(" ");
        } else sb.append(0).append(" ");

        if (a == b && b == c) {
            sb.append(1);
        } else sb.append(0);

        System.out.println(sb);
    }
}