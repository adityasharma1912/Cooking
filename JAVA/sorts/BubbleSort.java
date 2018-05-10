public class BubbleSort{
	public static void main(String args[]){
		int arr[] = {10,9,6,3,8,1,7,2,0};
		boolean any_swap = false;
		int temp;
		int total_swap_counts = 0;
		for(int i = 0; i < arr.length; i++){
			any_swap = false;
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					/*
					Swapping going on here.
					*/
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					any_swap = true;
					total_swap_counts++;
				}
			}
			if(!any_swap)
				break;
		}

		for(int i = 0; i< arr.length; i++){
			System.out.print(""+arr[i]+" ");
		}
		System.out.println("");
		System.out.println("total_swap_counts = "+total_swap_counts);
		return;
	}
}