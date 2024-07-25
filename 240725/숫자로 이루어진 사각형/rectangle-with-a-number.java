import java.util.*;
import java.io.*;

public class Main {
    private static void printRect(int N){
        int n = 1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(n == 10)
                    n = 1;
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printRect(N);
    }
}