import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sumVal = 0;
        
        for(int i = n; i <= 100; i++) {
            sumVal += i;
        }
        System.out.print(sumVal);
    }
}