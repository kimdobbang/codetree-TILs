import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 5; i < 18; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb.toString());
    } 
}