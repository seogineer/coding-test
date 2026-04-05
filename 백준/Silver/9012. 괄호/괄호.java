import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < tc; t++) {
            Stack<Character> stack = new Stack<>();
            String ps = br.readLine();
            boolean flag = true;
            
            for (int i = 0; i < ps.length(); i++) {
                char c = ps.charAt(i);
                
                if (c == '(') {
                    stack.push(c);
                    continue;
                } else if (c == ')' && !stack.isEmpty()) {
                    stack.pop();
                    continue;
                } else if (c == ')' && stack.isEmpty()) {
                    flag = false;
                    break;
                }
            }
            
            System.out.println(stack.isEmpty() && flag ? "YES" : "NO");
        }
        br.close();
    }
}