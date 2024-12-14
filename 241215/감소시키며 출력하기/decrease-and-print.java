import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 17; i > 4; i--) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}