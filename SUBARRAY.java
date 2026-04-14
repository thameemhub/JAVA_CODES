public class SUBARRAY {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum = sum + arr[j];

                if (sum == target) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
