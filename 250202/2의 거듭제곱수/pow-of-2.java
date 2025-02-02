import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        int n = Integer.parseInt(br.readLine());
        int x = 0;

        while (n > 1) {
            n /= 2;
            x ++;
        }

        System.out.print(x);  
    }
}