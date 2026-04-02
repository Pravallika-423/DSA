package stack;

import java.util.Scanner;

public class CreatingStack {

	static int[] stack;
	static int top;

	static void createStack(int size) {
		stack = new int[size];
		top = -1;
		System.out.println("size of stack is :" + size);
	}

	static void push(int e) {
		if (top == stack.length - 1) {
			System.out.println("stack overflow...");
		} else {
			top++;
			stack[top] = e;
			System.out.println(e);
		}
	}

	static void pop() {
		if (top == -1) {
			System.out.println("stack underflow...");
		} else {
			System.out.println(stack[top] + "had been deleted");
			stack[top] = -1;
			top--;
		}
	}

	static boolean isEmpty() {
		return top == -1;
	}

	static boolean isFull() {
		return top == stack.length - 1;
	}

	static void display()

	{
		if (isEmpty()) {
			System.out.println("stack is EMpty");

		} else {
			System.out.println("stack elements");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}

	}

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("=============stack===========");
		while (true) {
			System.out.println("==========Menu============");
			System.out.println("1.createStack\n2.push\n3.pop\n4.dispaly\n5.peek\n6.isEmpty\n7.isFull\n8.Exit");
			int input = ip.nextInt();
			switch (input) {
			case 1: {
				createStack(9);
				break;
			}
			case 2: {
				push(1);
				push(8);
				push(7);
				System.out.println();
			}
			case 3:{
				pop();
			}
			case 4:{
				display();
			}
			
			}
		}
	}
}
