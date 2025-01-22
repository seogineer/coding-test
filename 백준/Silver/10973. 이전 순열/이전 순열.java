import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int pivot = -1;
        for (int i = N - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                pivot = i - 1;
                break;
            }
        }
        
        if (pivot == -1) {
            System.out.println(-1);
            return;
        }
        
        for (int i = N - 1; i > 0; i--) {
            if (arr[pivot] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        
        int start = pivot + 1;
        int end = N - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        for (int el : arr) {
            System.out.print(el + " ");
        }
        sc.close();
    }
}