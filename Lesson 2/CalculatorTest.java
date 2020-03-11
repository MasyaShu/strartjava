import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String reply = "Y";
		while(reply.equalsIgnoreCase("Y")) {
			Calculator calculator = new Calculator();
			System.out.print("Введите первое число: ");
			calculator.setA(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setSing(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setB(scan.nextInt());
			System.out.println(calculator.calculate());

			do {
				System.out.print("Хотите продолжить? [Y/N]: ");
				reply = scan.next();
			} while(!(reply.equalsIgnoreCase("N") || reply.equalsIgnoreCase("Y")));
		}
	}
}