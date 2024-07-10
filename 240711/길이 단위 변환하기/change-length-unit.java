public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double ftToCm = 30.48;
        double miToCm = 160934;
        double ft = 9.2;
        double mi = 1.3;
        double ressult1 = ft * ftToCm;
        double ressult2 = mi * miToCm;
        System.out.printf("%.1fft = %.1fcm\n", ft, ressult1);
        System.out.printf("%.1fmi = %.1fcm", mi, ressult2);
    }
}