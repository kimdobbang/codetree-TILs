import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        sb.append(y).append(".").append(m).append(".").append(d);
        System.out.print(sb);
    }
}