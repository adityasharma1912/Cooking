import java.util.TreeSet;

public class SubSequenceStrings {
	static TreeSet<String> getSubsets(char set[]) {
		int n = set.length;
		TreeSet<String> treeSet = new TreeSet<String>();
		for (int i = 1; i < (1 << n); i++) {
			String finalStr = "";
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					finalStr = finalStr + set[j];
			}
			treeSet.add(finalStr);
		}
		return treeSet;
	}

	static void printSubsets(TreeSet<String> treeSet) {
		for (String str : treeSet) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		char set[] = { 'a', 'd', 'c' };
		printSubsets(getSubsets(set));
	}
}
