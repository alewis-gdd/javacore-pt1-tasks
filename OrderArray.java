import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class OrderArray {

    public static boolean isOrdered(String[] args){
        int arrLength, num;
        String fileName;
        boolean result = false;

        fileName = args[0];

//        System.out.println("function called");

        try (BufferedReader fReader = new BufferedReader(new FileReader(fileName))){
            String[] numStrings;

            arrLength = Integer.parseInt(fReader.readLine());

            int[] numArray = new int[arrLength];
            numStrings = fReader.readLine().split(" ");


            for( int i = 0; i < arrLength; i++){
                numArray[i] = Integer.parseInt(numStrings[i]);
            }

            int prev = numArray[0];

            for (int integers : numArray){
                if(integers >= prev){
                    prev = integers;
//                    System.out.println("prev in loop: " + prev);
                    continue;
                }else {
                    return false;
                }
            }

            result = true;


        } catch (NumberFormatException e) {
            System.err.println("Argument" + args[0] + "must be an integer: " + e.getMessage());
            System.exit(1);

        } catch (IOException e){
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        return result;
    }

    public static void main(String[] args){
        boolean result;

        OrderArray obj = new OrderArray();
        result = obj.isOrdered(args);

        System.out.println(result);
    }

}