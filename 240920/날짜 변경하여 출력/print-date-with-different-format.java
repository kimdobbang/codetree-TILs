import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(),".");
    StringBuilder sb = new StringBuilder();

    String y = st.nextToken();
    String m = st.nextToken();
    String d = st.nextToken();
    
    sb.append(m).append("-").append(d).append("-").append(y);
    System.out.print(sb);
    }

}