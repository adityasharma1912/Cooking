//package leetCode;

public class NthDigitInfiniteSequence {

	public static void main(String args[]) {
		NthDigitInfiniteSequence object = new NthDigitInfiniteSequence();
		System.out.println(""+object.findNthDigit(10));
	}

	public int findNthDigit(int n) {

		String big_array="";

		for(int i=1;big_array.length()<=Integer.MAX_VALUE;i++){
			big_array=big_array+""+i;
		}

		System.out.println("BIG - ARRAY : "+ big_array);


    	    return Integer.parseInt(""+big_array.toCharArray()[n-1]);
	}

}
