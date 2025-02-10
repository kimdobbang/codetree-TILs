import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int starE = 1;
        int starO = n;
        for (int i = 0; i < 2 * n; i++) {
            // i짝수일때
            if (i % 2 == 0) {
                for(int j = 0; j < starE ; j++) {
                    sb.append("* ");
                }
                starE++;
            // i홀수일때
            } else {
                for (int j = 0; j < starO; j++) {
                    sb.append("* ");
                }
                starO--;
            }
            sb.append("\n");
        }
        System.out.print(sb);

        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // int n = Integer.parseInt(bf.readLine());

        // for(int i = 0; i < n ; i ++){
        //     if (i % 2 ==0){
        //         for(int j = 0; j < 1 + (i / 2); j++){
        //             bw.write("* ");
        //         }
        //     }
        //     else{
        //         for(int j = 0 ; j < n - (i - 1) / 2; j ++){
        //             bw.write("* ");
        //         }
        //     }
        //     bw.write("\n");
        // }
        // for(int i = n-1; i >=0; i --){
        //     if (i % 2 ==0){
        //         for(int j = 0; j < 1 + (i / 2); j++){
        //             bw.write("* ");
        //         }
        //     }
        //     else{
        //         for(int j = 0 ; j < n - (i - 1) / 2; j ++){
        //             bw.write("* ");
        //         }
        //     }
        //     bw.write("\n");
        // }
        // bw.flush();

    }
}