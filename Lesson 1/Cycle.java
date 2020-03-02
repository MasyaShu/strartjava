public class Cycle {
	public static void main(String[] args) {
		for(int i=0; i <= 20; i++) {
			System.out.println(i);
		}

		int j = 6;
		while(j >= -6) {
			System.out.println(j);
			j = j - 2;
		}

		int value = 10;
		do {
			if(value % 2 > 0) {
				System.out.println(value);
			}
			value = value + 1;
		}
		while(value <= 20);
	}
}