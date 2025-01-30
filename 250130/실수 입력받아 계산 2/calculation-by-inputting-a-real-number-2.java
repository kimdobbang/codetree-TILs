import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
                
        double n = Double.parseDouble(br.readLine().trim());
        n += 1.5;
        System.out.printf("%.2f", n);
        
    }
}