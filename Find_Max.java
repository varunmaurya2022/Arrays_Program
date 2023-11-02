public class Find_Max {
	public static void main(String... args) {
		// int arr[] = { 1, 2, 3, 5, 4, 3, 2, 6, 8, 7 };
		// Show_max(arr);
		Show_max(new int[] { 1, 2, 3, 4, 5 }); // Anonymous Object
	}

	public static void Show_max(int[] input) {
		int largest = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > largest) {
				largest = input[i];
			}
		}
		System.out.println("Max value is " + largest);
	}
}