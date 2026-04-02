package stack;

public class BracketBalance {

	static char[] stack;
	static int top;
	static void push()
	{
		top++;
		stack[top]='(';
	}
	static void pop()
	{
		top--;
	}
	public static void main(String[] args) {
		String s="(())";
		stack=new char[s.length()];
		top=-1;
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='(' )
			{
				push();
			}
			else if(c==')'&& top==-1) {
				flag=false;
				break;
			}
			else if(c==')' && stack[top]=='(')
			{
				pop();
			}
		}
		if(top==-1 && flag==true)
		{
			System.out.println("balanced....");
		}
		else {
			System.out.println("not balanced.....");
		}
	}
	
}
