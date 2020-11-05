public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld!");
		System.out.println("1");
		System.out.println("HelloWorld!");
		System.out.println("2");

		int num = 0;
		for (int i = 0; i < 35; i++) {
			for (int j = 0; j < 35; j++) {
				if (i * 2 + j * 4 == 94 & i + j == 35) {
					System.out.println("鸡"+i+"只，兔"+j+"只");
					num = 1;
				}
			}
		}
		if (num == 0){
			System.out.println("无解");
		}
	}
}