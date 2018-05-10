import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Singleton{
	private static Singleton firstInstance = null;
	private void Singleton(){};
	private static Integer valueArray[] = {0,1,2,3,4,5,6,7,8};

	private static LinkedList<Integer> linkedList = new LinkedList(Arrays.asList(valueArray));

	public static Singleton getInstance(){
		if(firstInstance == null){
			firstInstance = new Singleton();
			Collections.shuffle(linkedList);
		}
		return firstInstance;
	}

	public LinkedList getList(){
		return linkedList;
	}

	public LinkedList getElements(int number){
		LinkedList<Integer> temp = new LinkedList<Integer>();
		for(int i=0; i < number; i++){
			temp.add(linkedList.remove(0));
		}
		return temp;
	}

}