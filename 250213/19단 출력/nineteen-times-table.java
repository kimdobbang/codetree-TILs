import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solution();
        bw.flush();
    }

    public static void solution() throws IOException{
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                
                sb.append(String.format("%d * %d = %d", i, j, i * j));
                // j가 19아닌 홀수면 / 추가, 19거나 짝수면 줄바꿈
                if (j % 2 == 0 || j % 19 == 0) {
                    sb.append("\n");
                    continue;
                }
                sb.append(" / ");
            }
        } 
  
        bw.write(sb.toString());
    }
}
