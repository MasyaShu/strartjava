public class WolfTest {

	public static void main(String[] args) {
		
		Wolf wolf = new Wolf();
		wolf.setMale(false);
		wolf.setNickname("Barbos");
		wolf.setWeight(13.4f);
		wolf.setAge(8);
		wolf.setColor("Черный");

		if(wolf.isMale()) {
			System.out.println("Пол: male");
		} else{
			System.out.println("Пол: female");
		}
		System.out.println("Кличка: " + wolf.getNickname());
		System.out.println("Вес: " + wolf.getWeight());
		System.out.println("Возвраст: " + wolf.getAge());
		System.out.println("Окрас: " + wolf.getColor());
		
		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}