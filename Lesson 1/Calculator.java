public class Calculator {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int result = 0;
		char expression = '^';

		if(expression == '+') {
			result = a + b;
		} else if(expression == '-') {
			result = a - b;
		} else if(expression == '/') {
			if(b!=0){
				result = a / b;
			}
		} else if(expression == '*') {
			result = a * b;
		} else if(expression == '%') {
			result = a % b;
		} else if(expression == '^') {
			result = a;
			for(int i = 2; i <= b; i++)
				{
					result = result * a;
				}
		}
		System.out.println(result);
	}
}