package stack;

public class BracketBalance2 {

	static char[] Stack;
	static int top;
	public static void push(char ch) {
		top++;
		Stack[top]=ch;
	}
	public static void pop() {
		top--;
	}
	public static void main(String[] args) {
		String s="{[()]}";
		Stack = new char[s.length()];
		top=-1;
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '(' || c=='{' || c=='[') {
				push(c);
			}
			else if(top!=-1 && ((Stack[top]=='[' && c == ']' ) || (Stack[top]=='{' && c=='}') || (Stack[top]=='(' && c==')'))) {
				pop();
			}
			else {
				flag=false;
				break;
			}
		}
		if(top==-1 && flag==true) {
			System.out.println("balanced");
		}
		else {
			System.out.println("not balanced");
		}
	}
	
}
