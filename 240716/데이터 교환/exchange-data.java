public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 변수 선언
        int a = 5, b = 6, c = 7;

        // 교체
        int temp = a;
        a = c;
        c = b;
        b = temp;

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}