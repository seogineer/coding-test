import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        for(int i = 1; i <= n; i++){
            int input = sc.nextInt();
            if(start < input){
                for(int j = start + 1; j <= input; j++){
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = input;
            } else if(stack.peek() != input){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb.toString());
        sc.close();
    }
}