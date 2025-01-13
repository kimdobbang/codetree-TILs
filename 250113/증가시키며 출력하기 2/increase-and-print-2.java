import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        StringBuilder sb = new StringBuilder();
        int i = 10;
        while (i <= 26) {
            sb.append(i).append(" ");
            i ++;
        }
        System.out.print(sb);
    }
}