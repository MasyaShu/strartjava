public class MyFirstGame {
	public static void main(String[] args) {
		int input = 1;
		int secret = 19;

		if(input > secret) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if(input < secret) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
		}
	}
}