import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Введите первое число: ");
			Calculator calculator = new Calculator();
			calculator.setA(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setSing(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setB(scan.nextInt());
			calculator.calculate();
			System.out.println(calculator.getResult());

			boolean isExit = false;
			String reply;
			do {
				System.out.print("Хотите продолжить? [Y/N]: ");
				reply = scan.next();
				if(reply.equalsIgnoreCase("N")) {
					isExit = true;
				}
			} while(!(reply.equalsIgnoreCase("N") || reply.equalsIgnoreCase("Y")));

			if(isExit) {
				break;
			}
		}
	}
}