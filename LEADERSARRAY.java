public class LEADERSARRAY {
    public static void main(String[] args) {
        
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int flag = 0;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}