
public class LeastCommonAncestor {
	public static void main(String args[]) {
		String a = new String("oh yeah");
		String b = "oh yeah";

		if (a == b) {
			System.out.println("references are equal");
		}
		if (a != null && a.equals(b)) {
			System.out.println("values are equal");
		}

	}
}
