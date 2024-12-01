import java.io.*;
import java.util.*;

public class Main {
    static String res;
    public static void main(String[] args) throws IOException {
        // 입력 스트림과 출력 스트림 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringBuilder를 사용하여 출력할 문자열을 처리
        StringBuilder sb = new StringBuilder();

        // 입력 값 받기
        int n = Integer.parseInt(br.readLine());

        if (n < 0) {
            res = "ice";
        } else if (n >= 100) {
            res = "vapor";
        } else {
            res = "water";
        }
        sb.append(res);
        bw.write(sb.toString());
        bw.flush();
    }
}