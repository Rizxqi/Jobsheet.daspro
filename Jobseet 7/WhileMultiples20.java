import java.util.Scanner;

/**
 * WhileMultiples20
 */
public class WhileMultiples20 {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);      
        
        System.out.print("Input the multiple : ");
        int multiple = input.nextInt();

        int sum=0;
        int counter=0; 
        int multiples = 20;
        int i= 0;

        System.out.print("Input the multiple : ");

        while ( i<=50) {      
            
            if (i % multiples == 0 ) {
                sum = sum +i;
                counter++;               
            }
            i++;
        }  
        System.out.printf("there are %d numbers that are multiple of %d in range 1to 50 .\n", counter, multiples);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiples, sum );  
    }
}

//     int [] num = new int [4] ;  
//     num[0] = 5;
//     num[1] = 12;
//     num[2] = 7;
//     num[3] = 20;

//     System.out.println(num [0]);
//     System.out.println(num [1]);
//     System.out.println(num [2]);
//     System.out.println(num [3]);

//     }
// }