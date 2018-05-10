public class TestEverything{
	public static void main(String args[]){
		Singleton instance1 = Singleton.getInstance();
		System.out.println("instance1 = "+instance1.toString());
		System.out.println("value = "+instance1.getList());
		System.out.println("removedElements = "+instance1.getElements(1));
		Singleton instance2 = Singleton.getInstance();
		System.out.println("instance2 = "+instance2.toString());
		System.out.println("value = "+instance2.getList());
		System.out.println("removedElements = "+instance2.getElements(2));
		System.out.println("value = "+instance2.getList());
	}
}