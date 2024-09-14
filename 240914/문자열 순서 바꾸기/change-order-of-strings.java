import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String t = br.readLine();

        sb.append(t).append("\n").append(s);
        System.out.print(sb);
    }
}