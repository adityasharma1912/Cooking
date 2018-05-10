import java.util.*;
import java.io.*;

public class FileWrite{
    public static void main(String args[]){
        try{
            PrintWriter writer = new PrintWriter("testing", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
}
