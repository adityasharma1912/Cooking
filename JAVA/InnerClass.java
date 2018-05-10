public class InnerClass {
	class Private {
		private String hello() {
			// System.out.println("SESESE");
			return "Hello";
		}
	}

	public static void arrayCopy(int temp[], int arr1[], int arr2[]) {
		System.arraycopy(arr1, 0, temp, 0, 4);
		System.arraycopy(arr1, 0, temp, 4, 4);
	}

	public static void alterArray(int arr[]) {
		arr[0] = 4;
	}

	public static void main(String args[]) {
		Object o;
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 6, 7, 8 };
		int temp[] = new int[arr1.length + arr2.length];
		arrayCopy(temp, arr1, arr2);
		for (int i : temp)
			System.out.print(" " + i);

		alterArray(arr2);
		System.out.println("After 2 after alteration:");
		for (int i : arr2)
			System.out.println(" " + i);

		int p = 5;
		int q = 7;
		System.out.println("XOR of 5 and 7 is : " + (p ^ q));

		InnerClass innerClass = new InnerClass();
		o = (Private) innerClass.new Private();
		((Private) o).hello();
		// System.out.println(o.getClass().getSimpleName());
	}
}
