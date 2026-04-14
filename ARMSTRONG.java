public class ARMSTRONG {
    public static void main(String[] args) {
        
        int n = 153;   
        int temp = n;
        int sum = 0;
        int digits = 0;
        int t = n;

        while (t != 0) {
            digits++;
            t = t / 10;
        }

        while (temp != 0) {
            int d = temp % 10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power = power * d;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}