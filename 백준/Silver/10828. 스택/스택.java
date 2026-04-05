import java.io.*;
import java.util.*;

class Main {
    private static int[] stack = new int[1];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < tc; t++) {
            String[] input = br.readLine().split(" ");
            String f = input[0];
            
            if ("push".equals(f)) {
                String s = input[1];
                int[] newStack = Arrays.copyOf(stack, stack.length + 1);
                newStack[newStack.length - 1] = Integer.parseInt(s);
                stack = newStack;
            } else if ("top".equals(f)) {
                if (stack.length == 1) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(stack[stack.length - 1]).append('\n');
                }
            } else if ("size".equals(f)) {
                sb.append(stack.length - 1).append('\n');
            } else if ("empty".equals(f)) {
                if (stack.length == 1) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if ("pop".equals(f)) {
                if (stack.length == 1) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(stack[stack.length - 1]).append('\n');
                    int[] newStack = Arrays.copyOf(stack, stack.length - 1);
                    stack = newStack;
                }
            }
        }
        System.out.print(sb);
        br.close();
    }
}