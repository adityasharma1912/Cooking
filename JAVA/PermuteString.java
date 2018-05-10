import java.util.Scanner;
import java.util.HashSet;

public class PermuteString{
    
    private static int global = 0;
    private static HashSet<String> memory = new HashSet<String>();
    
    private static void permuteString(String prefix, String string){
        int n = string.length();
        if(n == 0){
            global++;
            System.out.println(prefix);
            return;
        }
        
        for(int i = 0; i<n; i++){
            String temp_prefix = prefix + string.charAt(i);
            if(!memory.contains(temp_prefix)){
                memory.add(temp_prefix);
                permuteString(temp_prefix,string.substring(0,i)+string.substring(i+1));
            }
            else
                break;
        }
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String string = scanner.next();
        permuteString("",string);
        System.out.println("Global: "+global);
    }
}
    
