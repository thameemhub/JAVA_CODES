public class PRIME {
    public static void main(String[] args) {
        
        int n = 20; 
        int count = 0;

        for (int i = 2; i <= n; i++) {
            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
