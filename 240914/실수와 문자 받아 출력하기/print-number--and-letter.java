import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String c = br.readLine();
        String a = String.format("%.2f", Double.parseDouble(br.readLine()));
        String b =  String.format("%.2f",Double.parseDouble(br.readLine()));
        
        sb.append(c).append("\n").append(a).append("\n").append(b);

        System.out.println(sb);


    }
}