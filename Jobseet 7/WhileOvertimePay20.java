import java.util.Scanner;

/**
 * WhileOvertimePay20
 */
public class WhileOvertimePay20 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int numEmployee ;
        int overtimeHours;
        int overtimePay = 0 ;
        double totalOvertimePay = 0 ;
        String position;

        System.out.print("Employee Number = ");
        numEmployee = input20.nextInt();
        int i=0;
        while(i<numEmployee){
            System.out.println(" Position of employee "+(i+1)+" (director, manager, staff) = \n");
            position = input20.next();
            System.out.print(" Employee "+(i+1)+" Overtime Hours = ");
            overtimeHours = input20.nextInt();
        i++;

        if(position.equalsIgnoreCase("director")){
            continue;
        }else if (position.equalsIgnoreCase("manager")) {
            overtimePay= overtimeHours*100000;
        }else if (position.equalsIgnoreCase("staff")){
            overtimePay= overtimeHours*75000;
        }else{
            System.out.println("Invalid Position!");
            i--;
        continue;
        }

        totalOvertimePay += overtimePay; 
        
        System.out.print("Total of Overtime Pay = " +totalOvertimePay);
        }
    }
}