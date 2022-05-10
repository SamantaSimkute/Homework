package taskAtHome;

 class MaxWater {

public static int maxArea(int array[] , int length) {
		int leftLine = 0;
		int rightLine = length - 1;
		int area = 0;

		while (leftLine < rightLine) {
			area = Math.max(area, Math.min(array[leftLine], array[rightLine]) * (rightLine - leftLine));

			if (array[leftLine] < array[rightLine])
				leftLine += 1;

			else
				rightLine -= 1;
		}
		return area;
	}

	public static void main(String[] args) {
		int arrayToTry[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int length = arrayToTry.length;
		System.out.print(maxArea(arrayToTry, length));
	}
}
	
	
					
