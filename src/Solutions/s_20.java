package Solutions;

import java.util.Stack;

public class s_20 {
	static boolean match(char a, char b) {
		if (a == '(' && b == ')')
			return true;
		else if (a == '{' && b == '}')
			return true;
		else if (a == '[' && b == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String arr = "()";
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < arr.length(); i++) {
			char c = arr.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				s.push(c);
			else if (c == ')' || c == '}' || c == ']') {
				if (s.isEmpty() == true)
					System.out.println("false");
				else {
					boolean val = match(c, s.pop());
					if (val == false)
						System.out.println("false");
				}
			}

		}
		if (s.isEmpty())
			System.out.println("true");
		else
			System.out.println(false);
	}
}
