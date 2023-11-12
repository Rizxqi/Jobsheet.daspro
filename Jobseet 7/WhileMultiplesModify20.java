import java.util.Scanner;

/**
 * WhileMultiplesModify20
 */
public class WhileMultiplesModify20 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);      
        
        System.out.print("Input the multiple : ");
        int multiple = sc.nextInt();

        int sum=0;
        int counter=0; 
        int multiples = 20;
        double average ; 
        int i=0;

        System.out.print("Input the multiple : ");

        while ( i<=50) {                  
            if (i % multiples == 0 ) {
                sum = sum +i;
                counter++;               
            }
            i++;
        }  
        average = (double) sum / counter;

        System.out.printf("there are %d numbers that are multiple of %d in range 1to 50 .\n", counter, multiples);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiples, sum );  
        System.out.printf("The average of all multiples of %d in range 1 s.d. 50 is %.2f. \n", multiple, average);
        
         sc.close();
    }
}