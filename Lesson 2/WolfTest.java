public class WolfTest {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.isMale = false;
		wolf.nickname = "Barbos";
		wolf.weight = 13.4f;
		wolf.age = 4;
		wolf.color = "Черный";

		if(wolf.isMale) {
			System.out.println("Пол: male");
		} else{
			System.out.println("Пол: female");
		}
		System.out.println("Кличка: " + wolf.nickname);
		System.out.println("Вес: " + wolf.weight);
		System.out.println("Возвраст: " + wolf.age);
		System.out.println("Окрас: " + wolf.color);
		
		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}