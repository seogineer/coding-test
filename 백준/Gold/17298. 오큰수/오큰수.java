import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int n = 0; n < N; n++) {
            seq[n] = Integer.parseInt(st.nextToken());
        }
        
        for (int n = 0; n < N; n++) {
            while (!stack.isEmpty() && seq[stack.peek()] < seq[n]) {
                seq[stack.peek()] = seq[n];
                stack.pop();
            }
            stack.push(n);
        }
        
        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seq.length; i++) {
            sb.append(seq[i]).append(" ");
        }
        System.out.println(sb);
        
        br.close();
    }
}