import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Введите первое число: ");
			int a = scan.nextInt();
			
			System.out.print("Введите знак математической операции: ");
			String sing = scan.next();
			
			System.out.print("Введите второе число: ");
			int b = scan.nextInt();

			Calculator calculator = new Calculator();
			calculator.setA(a);
			calculator.setB(b);
			calculator.setSing(sing);
			calculator.getResultSing();
			System.out.println(calculator.getResult());

			boolean isExit = false;
			while(true) {
				System.out.print("Хотите продолжить? [Y/N]: ");
				String otvet = scan.next();
				if(otvet.equalsIgnoreCase("N")) {
					isExit = true;
					break;
				} else if(otvet.equalsIgnoreCase("Y")) {
					break;
				}	
			}

			if(isExit) {
				break;
			}
		}
	}
}