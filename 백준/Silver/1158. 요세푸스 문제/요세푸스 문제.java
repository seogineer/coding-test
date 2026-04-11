import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int n = 1; n <= N; n++) {
            q.add(n);
        }
        
        StringBuilder sb = new StringBuilder();
        
        int k = 1;
        while (!q.isEmpty()) {
            int el = q.poll();
            
            if (k % K == 0) {
                if (q.size() > 0) {
                    sb.append(el).append(", ");
                } else {
                    sb.append(el);
                }
            } else {
                q.offer(el);
            }
            k++;
        }
        
        System.out.println("<" + sb + ">");
        br.close();
    }
}