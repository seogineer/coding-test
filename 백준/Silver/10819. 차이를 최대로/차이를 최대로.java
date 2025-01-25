import java.util.*;
class Main {
    static int max = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        permute(arr, 0);
        
        System.out.println(max);
        sc.close();
    }
    
    private static void permute (int[] arr, int depth) {
        if (depth == arr.length) {
            max = Math.max(max, calculateDifference(arr));
            return;
        }
        
        for (int i = depth; i < arr.length; i++) {
            swap(arr, i, depth);
            permute(arr, depth + 1);
            swap(arr, i, depth);
        }
    }
    
    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static int calculateDifference (int[] arr) {
        int maxDifference = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            maxDifference += Math.abs(arr[i] - arr[i + 1]);
        }
        return maxDifference;
    }
}