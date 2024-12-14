import java.io.*; 
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        StringBuilder sb = new StringBuilder();
        for (int i = 5; i < 18; i += 2) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}