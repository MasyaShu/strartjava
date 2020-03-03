public class Calculator {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int result = 0;
		char sign  = '^';

		if(sign  == '+') {
			result = a + b;
		} else if(sign  == '-') {
			result = a - b;
		} else if(sign  == '/') {
			if(b != 0){
				result = a / b;
			}
		} else if(sign  == '*') {
			result = a * b;
		} else if(sign  == '%') {
			result = a % b;
		} else if(sign  == '^') {
			result = a;
			for(int i = 2; i <= b; i++) {
				result *= a;
			}
		}
		System.out.println(result);
	}
}