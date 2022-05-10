package taskAtHome;

public class FirstTask {

	static void findTriplets(int[] array, int sumWeWantToGet) {

		boolean found = false;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == sumWeWantToGet) {
						if (array[i] != array[j] && array[j] != array[k] && array[k] != array[i]) {

							System.out.print("["+array[i]);
							System.out.print(" ");
							System.out.print(array[j]);
							System.out.print(" ");
							System.out.print(array[k]+"]");
							System.out.print("\n");
							found = true;
						}
					}
				}
			}
		}

		if (found == false)
			System.out.println(" The triplet that the sum would be " + sumWeWantToGet + " does not exist");
	}

	public static void main(String[] args) {
		int array[] = { -1, 0, 1, 2, -1, -4};
		int sumWeWantToGet = 0;
		findTriplets(array, sumWeWantToGet);

	}
}
