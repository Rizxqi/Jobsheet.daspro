import java.util.Scanner;

/**
 * arrayValue20
 */
public class arrayValue20 {

    public static void main(String[] args) {
    Scanner arrayValue20 = new Scanner(System.in);

    int[] finalScore = new int [10] ;
        
    for (int i = 0; i < finalScore.length; i++) {

        System.out.print("Enter the final score" + i + " : ");
        finalScore[i] = arrayValue20.nextInt(); 

            if (finalScore[i] > 70) {
                System.out.println("Student " + i + "Pass");
                }else {
                System.out.println("Student are= " + i + "Failed");
                }
            }               
    }
}


