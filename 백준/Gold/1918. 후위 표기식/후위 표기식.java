import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<Character>();
		String output="";
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			char c=input.charAt(i);
			if(c>='A' && c<='Z') {
				output=output+c;
			}else if(c=='+' || c=='-') {
				while(!s.isEmpty()) {
					char prev_c=(char) s.pop();
					if(prev_c=='+' || prev_c=='-' || prev_c=='*' || prev_c=='/') {
						output=output+prev_c;
					}else {
						s.push(prev_c);
						break;
					}
				}
				s.push(c);
			}else if(c=='*' || c=='/') {
				while(!s.isEmpty()) {
					char prev_c=(char) s.pop();
					if(prev_c=='*' || prev_c=='/') {
						output=output+prev_c;
					}else {
						s.push(prev_c);
						break;
					}
				}
				s.push(c);
			}else if(c=='(') {
				s.push(c);
			}else if(c==')') {
				while(true) {
					char prev_oper=s.pop();
					if(prev_oper=='(') {
						break;
					}
					output=output+prev_oper;
				}
			}
		}
		
		while(!s.isEmpty()) {
			output=output+s.pop();
		}
		
		System.out.println(output);
	}

}