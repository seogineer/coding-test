import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        Stack<Integer> stack = new Stack();
        int num = 1;
        
        for (int t = 0; t < n; t++) {
            int input = Integer.parseInt(br.readLine());
            
            if (input >= num) {
                for (int i = num; i <= input; i++) {
                    stack.push(i);
                    num++;
                    sb.append("+").append("\n");
                }
            } else if (!stack.isEmpty() && stack.peek() != input) {
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            sb.append("-").append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}