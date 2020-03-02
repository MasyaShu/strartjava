public class ConditionalStatemen {
	public static void main(String[] args) {
		int age = 10;
		boolean isMale = true;
		float height = 1.79f;
		char firstLetterName = 'V';

		if(age > 20) {
			System.out.println("Возврат больше 20");
		}

		if(isMale) {
			System.out.println("Это мужчина");
		}

		if(height < 1.80) {
			System.out.println("Ваш рост меньше 1.80");
		}
		else {
			System.out.println("Ваш рост больше 1.80");
		}
		
		if(firstLetterName == 'M') {
			System.out.println("Первая буква M");
		} else if(firstLetterName == 'I') {
			System.out.println("Первая буква I");
		}
		else {
			System.out.println("Первая буква не M и не I");
		}

	}
}