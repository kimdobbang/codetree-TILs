import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt() + 8;
        int h = sc.nextInt();
        h *= 3;

        System.out.println(w);
        System.out.println(h);
        System.out.println(w * h);

    }
}