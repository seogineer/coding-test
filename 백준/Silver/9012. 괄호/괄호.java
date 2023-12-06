import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++){
            boolean flag = isValid(sc.next());
            if(flag){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push(input.charAt(i));
                continue;
            } else if(input.charAt(i) == ')' && !stack.isEmpty()){
                stack.pop();
                continue;
            } else if(input.charAt(i) == ')' && stack.isEmpty()){
                return false;
            }
        }

        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}