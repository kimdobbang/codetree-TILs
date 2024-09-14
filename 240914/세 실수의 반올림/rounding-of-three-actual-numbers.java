import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());

        // for (int i = 0; i < 3; i++) {
        //     double num = Double.parseDouble(br.readLine());
        //     sb.append(String.format("%.3f", num)).append("\n");
        // }
        sb.append(String.format("%.3f", a)).append("\n");
        sb.append(String.format("%.3f", b)).append("\n");
        sb.append(String.format("%.3f", c)).append("\n");
        System.out.print(sb);
    }
}