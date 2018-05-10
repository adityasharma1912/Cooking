import java.util.HashMap;

public class LonelyInteger {
	static int lonelyInteger(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				Integer value = map.get(arr[i]);
				value = value+1;
				map.put(arr[i], value);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		for(int i = 0;i<arr.length;i++){
			if(map.get(arr[i])==1){
				return arr[i];
			}				
		}		
		
		return 0;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5 };
		System.out.println("Lonely Integer = " + LonelyInteger.lonelyInteger(arr));
	}
}
