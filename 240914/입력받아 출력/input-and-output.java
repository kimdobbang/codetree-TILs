import java.io.*;

public class Main {
    static String a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        b = br.readLine();

        System.out.println(a +" "+ b);
    }
}