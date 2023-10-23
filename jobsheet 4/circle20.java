import java.util.Scanner;
/**
 * circle20
 */
public class circle20 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double circumference, area;
        System.out.println("input radius");
        r = input.nextInt();
        area = 3.14*r*r;
        circumference = 2*3.14*r;
        System.out.println("area" +area);
        System.out.println("circumference" +circumference);
    }
}