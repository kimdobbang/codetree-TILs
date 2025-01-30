import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        StringBuilder sb = new StringBuilder();
        
        String pre = st.nextToken();
        String x = st.nextToken();
        String y = st.nextToken();

        sb.append(pre).append("-").append(y).append("-").append(x);

        System.out.println(sb);

    }
}