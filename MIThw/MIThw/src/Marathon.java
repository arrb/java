public class Marathon {
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };
		int besTimeIndex = 0;

		for (int i = 0; i < names.length;) {
			int timeNow = times[i];
			for (int j = 1; j < names.length; j++) {

				int nextTime = times[j];

				if (timeNow < nextTime) {
					timeNow = nextTime;
					besTimeIndex = j;
				}

			}

			break;

		}
		System.out.println(names[besTimeIndex] + ": " + times[besTimeIndex]);

	}
}
