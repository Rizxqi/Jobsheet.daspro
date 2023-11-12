import java.util.Scanner;

/**
 * ForMultiples20
 */
public class ForMultiples20 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);      
        
        System.out.print("Input the multiple : ");
        int multiple = sc.nextInt();

        int sum=0;
        int counter=0; 
        int multiples = 20;
        double average;
        int i= 0;

        System.out.print("Input the multiple : ");
        for(i = 1; i<=50; i++){
            if (i % multiples == 0 ) {
                sum = sum +i;
                counter++;
                average = (double) sum / counter;               
                     
            }
        } 
        System.out.printf("there are %d numbers that are multiple of %d in range 1to 50 .\n", counter, multiples);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiples, sum );
        System.out.printf("The Average of all Multiples of %d in range 1 s.d. 50 is %.2f.  \n", multiple, average);     
    }
}
// import java.util.Scanner;

// /**
//  * ForMultiples20
//  */
// public class ForMultiplesModify20 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner (System.in);
//         int multiple=0 , sum=0 , counter=0; 
//         double average;

//         System.out.print("Input the multiple : ");
//         multiple = input.nextInt();
//         int i;
//         for(i = 1; i  <=50; i++){
//             if (i % multiple == 0 ) {
//                 sum = sum +i;
//                 counter++;
//                 average = (double) sum / counter;

//                 System.out.printf("there are %d numbers that are multiple of %d in range 1to 50 .\n", counter, multiple);
//                 System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum ); 
//                 System.out.printf("The Average of all Multiples of %d in range 1 s.d. 50 is %.2f.  \n", multiple, average);      
//             }
//         }      
//     }
// }