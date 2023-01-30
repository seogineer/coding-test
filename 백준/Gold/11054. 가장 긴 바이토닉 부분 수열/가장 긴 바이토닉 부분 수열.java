import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        
        int[] left = new int[N];
        leftDp(A, left);

        int[] right = new int[N];
        rightDp(A, right);

        System.out.println(getMax(left, right));
        
        sc.close();
    }

    static int getMax(int[] left, int[] right){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < left.length; i++){
            if(max < left[i] + right[i] - 1){
                max = left[i] + right[i] - 1;
            }
        }
        return max;
    }

    static void leftDp(int[] A, int[] left){
        for(int i = 0; i < A.length; i++){
            left[i] = 1;
            for(int j = 0; j < i; j++){
                if(A[i] > A[j] && left[i] <= left[j]){
                    left[i] = left[j] + 1;
                }
            }
        }
    }

    static void rightDp(int[] A, int[] right){
        for(int i = A.length - 1; i >= 0; i--){
            right[i] = 1;
            for(int j = A.length - 1; j > i; j--){
                if(A[i] > A[j] && right[i] <= right[j]){
                    right[i] = right[j] + 1;
                }
            }
        }
    }
}