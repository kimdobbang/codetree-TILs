import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 변수 선언
        String s, t;

        // 입력
        s = br.readLine();
        t = br.readLine();

        // 출력
        sb.append(t).append("\n").append(s);
        System.out.print(sb);
    }
}