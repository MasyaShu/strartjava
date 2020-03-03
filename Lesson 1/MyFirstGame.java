public class MyFirstGame {
	public static void main(String[] args) {
		int input = 1;
		int secret = 19;
		boolean gameOver = false;
		
		while(!gameOver) {
			if(input > secret) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			input -= 1;
			} else if(input < secret) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
			input += 1;
			} else {
			System.out.println("Вы угадали!");
			gameOver = true;
			}
		}
	}
}