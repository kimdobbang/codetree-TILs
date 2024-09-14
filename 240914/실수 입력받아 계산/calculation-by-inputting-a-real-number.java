import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        // double result = Math.round((a + b)*100.0)/100.0;
        // System.out.println(result);
        sb.append(String.format("%.2f", a + b));
        System.out.println(sb);
    }
}