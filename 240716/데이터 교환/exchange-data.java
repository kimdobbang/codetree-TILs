public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int temp;
        int temp2;

        temp = b;
        temp2 = c;
        b = a;
        c = temp;
        a = temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}