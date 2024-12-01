import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int benchMark = 80;
        int inputScore = Integer.parseInt(br.readLine());

        if (inputScore >= benchMark) {
            sb.append("pass");
        } else {
            int gapScore = benchMark - inputScore;
            sb.append(gapScore).append(" more score");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}