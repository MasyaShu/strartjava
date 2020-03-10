public class Wolf {

	private boolean isMale; //true M, false F
	private String nickname;
	private float weight;
	private int age;
	private String color;

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else { 
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Идем");
	}

	public void sit() {
		System.out.println("Сели");
	}

	public void run() {
		System.out.println("Бежим");
	}

	public void howl() {
		System.out.println("Воем");
	}

	public void hunt() {
		System.out.println("Охотимся");
	}
}