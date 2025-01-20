import java.io.*;
import java.util.*;
import java.math.*;

/*
변수를 두 개 선언하여 두 개의 정수 a, b를 입력받아 두 정수의 크기를 비교하고, 큰 수에서 작은 수까지 공백을 두고 차례대로 출력합니다
0. 변수를 두 개 선언하여 두 개의 정수 a, b를 입력받은 두 정수의 크기를 비교합니다.
1. b가 a보다 같거나 클 경우에는, b를 초기값으로 하고 i가 a보다 같거나 큰 경우에만 수행되도록 조건을 걸고 b의 값을 1씩 감소시키는 for문을 실행할 때의 각 변수 i의 값을 공백을 두고 차례대로 출력합니다.
2. b가 a보다 작을 경우에는, a를 초기값으로 하고 i가 b보다 같거나 큰 경우에만 수행되도록 조건을 걸고 a의 값을 1씩 감소시키는 for문을 실행할 때의 각 변수 i의 값을 공백을 두고 차례대로 출력합니다.
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        // int max = Math.max(a, b);
        // int min = Math.min(a, b);

        // for(int i = max; i >= min; i--) {
        //     sb.append(i).append(" ");
        // }

        if (b >= a) {
            for(int i = b; i >= a; i--) {
                sb.append(i).append(" ");
            }
        } else {
            for(int i = a; i >= b; i--) {
                sb.append(i).append(" ");
            }
        }

        System.out.print(sb);
 
    }
}