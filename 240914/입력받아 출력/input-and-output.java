import java.io.*;

public class Main {
    static int a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        sb.append(a + " " + b);

        System.out.println(sb);
    }
}