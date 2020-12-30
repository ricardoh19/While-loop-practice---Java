// compute the largest and smallest of 10 integer inputs
import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args){
        int i = 1;
        int largest = 0;
        int smallest = 2147483647;
        int even_count = 0;
        int odd_count = 0;
        int user_input = 0;

        // create new scanner object
        Scanner scan = new Scanner(System.in);

        while ( i <= 10){
            System.out.println("Enter number: ");
            user_input = scan.nextInt();
            if (user_input > largest ){
                largest = user_input;
            }
            if (user_input < smallest){
                smallest = user_input;
            }
            if (user_input % 2 ==0){
                even_count++;
            }
            if (user_input % 2 ==1){
                odd_count++;
            }
            i++;
        }
        //display results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Even count of numbers: " + even_count);
        System.out.println("Odd count of numbers: " + odd_count);
    }
}
