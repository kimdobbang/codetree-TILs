import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            double num = Double.parseDouble(br.readLine());
            sb.append(String.format("%.3f", num)).append("\n");
        }
        System.out.print(sb);
    }
}