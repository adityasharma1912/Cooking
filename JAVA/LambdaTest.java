import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Parent {
	private int gearValue = 4;

	int getGearValue() {
		return gearValue;
	}

	void setGearValue(int gearValue) {
		this.gearValue = gearValue;
	}

}

public class LambdaTest {

	void switchGear(Parent pObject, int gearValue) {
		pObject.setGearValue(gearValue);
	}

	public static void main(String[] args) {

		LambdaTest object = new LambdaTest();
		Parent pObject = new Parent();
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(17);
		arrayList.add(12);
		arrayList.add(11);
		arrayList.add(18);
		arrayList.add(12);
		arrayList.add(19);
		arrayList.add(10);
		System.out.println("Before sorting");
		arrayList.forEach(i -> System.out.println("Number: " + i));

		arrayList = arrayList.stream().sorted().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("After sorting");
		arrayList.forEach(i -> System.out.println("Number: " + i));

		System.out.println("Current Gear Value: " + pObject.getGearValue());
		object.switchGear(pObject, 5);
		System.out.println("Gear Value after switching gear: " + pObject.getGearValue());

	}
}
