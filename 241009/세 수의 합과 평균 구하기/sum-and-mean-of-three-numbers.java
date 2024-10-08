import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        int a = Integer.ParseInt(st.nextToken());
        int b = Integer.ParseInt(st.nextToken());
        int c = Integer.ParseInt(st.nextToken());

        sb.append(a + b + c).append("\n").append((a + b + c)/3);
        System.out.print(sb);
    }
}