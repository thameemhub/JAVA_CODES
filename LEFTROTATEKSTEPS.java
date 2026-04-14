public class LEFTROTATEKSTEPS {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;   // number of rotations

        for (int i = 0; i < k; i++) {
            int first = arr[0];

            // shift all elements to left
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
