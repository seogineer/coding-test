import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int n = 0; n < N; n++) {
            A[n] = Integer.parseInt(st.nextToken());
        }
        
        for (int n = 0; n < N; n++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[n]) {
                A[stack.peek()] = A[n];
                stack.pop();
            }
            stack.push(n);
        }
        
        while (!stack.isEmpty()) {
            A[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            sb.append(A[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}