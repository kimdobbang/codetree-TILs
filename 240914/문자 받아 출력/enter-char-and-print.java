// import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // char c = br.readLine().charAt(0);

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); // 문자열 입력.입력받은 문자열의 0번째 문자 추출
        System.out.print(c);
    }
}