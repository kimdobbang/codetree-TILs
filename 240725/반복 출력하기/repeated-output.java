import java.util.*;
import java.io.*;

public class Main {
    public static void printNlines(int n) {
            for(int i = 0; i < n; i++) {
                System.out.println("12345^&*()_");
            }
        }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        printNlines(rowNum);
        
    }
}