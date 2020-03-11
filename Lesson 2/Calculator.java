public class Calculator {

	private int a;
	private int b;
	private char sign;
	private int result;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public char getSign() {
		return sign;
	}

	public void setSing(char sign) {
		this.sign = sign;
	}

	public int getResult() {
		return result;
	}

	public void calculate() {
		switch(sign) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '/':
				if(b != 0) {
					result = a / b;
				}
				break;
			case '*':
				result = a * b;
				break;
			case '%':
				result = a % b;
				break;
			case '^':
				result = a;
				for(int i = 2; i <= b; i++) {
					result *= a;
				}
				break;
		}
	}
}