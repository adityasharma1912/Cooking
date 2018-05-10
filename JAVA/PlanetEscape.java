import java.util.Scanner;

public class PlanetEscape{

	private static void print(String str){
		System.out.println(str);
	}

	private static String escape(String str,int remove){

		if(str.length() <= remove)
			return "0";

		if(remove == 0)
			return str;

		char[] arr = str.toCharArray();
		int length  = arr.length;
		String output = "";
		int pick = length - remove;
		int min_index = -1;
		int start_index = 0;

		while(output.length()!=(arr.length-remove)){
			start_index = min_index + 1;
			int min = 10;
			//print(start_index+" "+min_index+" "+pick+" "+length);
			for(int index = start_index;index <= start_index+length-pick;index++){
				if((arr[index]-'0') < min){
					min = arr[index]-'0';
					min_index = index;
				}
			}
			output = output + arr[min_index];
			length = length - (min_index - start_index)-1;
			pick = pick - 1;
			//print(start_index+" "+min_index+" "+pick+" "+length+" "+output);
		}

		return output;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int remove = scanner.nextInt();
		print(escape(str,remove));
	} 
}