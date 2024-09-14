import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken()) + 1;
        int m = Integer.parseInt(st.nextToken());

        sb.append(h).append(":").append(m);
        System.out.print(sb);

    }
}