public class Test{

    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        int i = -2147483648;
        for(i = -2147483648; i<2147483647; i++)
            System.out.println(i);
        long endTime = System.currentTimeMillis();
        long timeElapsed = (endTime - startTime)/1000;
        System.out.println("Process completed in "+timeElapsed+" seconds with i = "+i);
    }
    
}
