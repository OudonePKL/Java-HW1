import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Take a nature less than 100, write down the number subtracted from 100,
// then write down the value subtracted from the previous numjber,
// and execute until the result is negative.

// @author: Oudone PKL

public class NumSubtracted {

    // Create method
    public static void subtractedNumber(int num, int defult, int result[]){

        int x;
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(defult));

        if (num < defult){
            
            while (true) { 
                arrlist.add(num);
                if (num < 0) {
                    break;
                }
                x = defult - num;
                defult = num;
                num = x;
            }
            
            System.out.println(arrlist);

        } else {
            System.out.println("Error!");
        }
    }

    public static void main(String[] args) {

        int result[] = {100};
        int defult = 100;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");

        // Call the method
        subtractedNumber(sc.nextInt(), defult, result);
        
    }
}
