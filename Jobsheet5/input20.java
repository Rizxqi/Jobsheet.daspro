import java.util.Scanner;

/**
 * input20
 */
public class input20 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("input a number = ");
        int number = input20.nextInt();
        if (number%2 == 0 ) {
            System.out.println(number+"is an even number! ");            
        } else {
            System.out.println(number+"is an odd number! ");            
        }
                
    }
}