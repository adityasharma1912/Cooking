import java.util.Scanner;
import java.util.HashSet;

public class PermuteIntegers{
    
    private static int global = 0;
    private static HashSet<String> memory = new HashSet<String>();
    
    private static void permuteIntegers(int prefix[], int arr[]){
        int n = arr.length();
        if(n == 0){
            global++;
            for(int i : prefix)
            System.out.println(i+" ");
            return;
        }
        
        for(int i = 0; i<n; i++){
            String temp_prefix = prefix + string.charAt(i);
            if(!memory.contains(temp_prefix)){
                memory.add(temp_prefix);
                permuteIntegers(temp_prefix,string.substring(0,i)+string.substring(i+1));
            }
            else
                break;
        }
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght of integer array: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        int prefix[] = new int[length];
        for(int i = 0;i<n;i++)
            arr[i] = scanner.nextInt();
        
        permuteIntegers(prefix, arr);
        System.out.println("Global: "+global);
    }
}
    
