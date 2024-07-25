import java.util.*;
import java.io.*;

public class Main {
    public static void printRect(int r, int c) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("1");   
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        printRect(r, c);
    }
}